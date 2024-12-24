package observeddicegame;

class ShakeCommand  implements Command {

    static class Observer implements GameObserver
    {

        private PositionChangeEvent event;

        @Override
        public void onOverflow(OverflowEvent overflowEvent) {
            event = overflowEvent;
        }

        @Override
        public void onUnderflow(UnderflowEvent underflowEvent) {
            event = underflowEvent;
        }
    }

    private final DiceShaker shaker;
    private final Observer observer;
    private final ObservedGame game;

    public ShakeCommand(DiceShaker shaker, ObservedGame game) {
        this.shaker = shaker;
        this.observer = new Observer();
        this.game = game;
        this.game.add(observer);
    }

    @Override
    public void execute() {
        game.advance(shaker.shake());
        game.detach(observer);
    }

    @Override
    public void undo() {
        game.setPosition(observer.event.originalPosition());
    }

}
