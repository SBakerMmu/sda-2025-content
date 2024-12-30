package observeddicegame;

class ShakeCommand implements Command {

    static class Observer implements ExtendedGameBoardObserver {
        PositionChangeEvent event;

        @Override
        public void onEvent(OverflowEvent overflowEvent) {
            event = overflowEvent;
        }

        @Override
        public void onEvent(UnderflowEvent underflowEvent) {
            event = underflowEvent;
        }

        @Override
        public void onEvent(HomeEvent homeEvent) {
            event = homeEvent;
        }

        @Override
        public void onEvent(PositionSetEvent setEvent) {
            event = setEvent;
        }
    }

    private final DiceShaker shaker;
    private final Observer observer;
    private final ExtendedObservedGameBoard game;

    public ShakeCommand(DiceShaker shaker, ExtendedObservedGameBoard game) {
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
        game.setPosition(observer.event.oldPosition());
    }

}
