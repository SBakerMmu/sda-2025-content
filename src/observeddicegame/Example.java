package observeddicegame;

import java.util.Stack;

public final class Example {

    private static class ExampleObserver implements GameObserver, ExtendedGameObserver
    {

        @Override
        public void onOverflow(OverflowEvent overflowEvent) {
            System.out.format("%s%n", overflowEvent);
        }

        @Override
        public void onUnderflow(UnderflowEvent overflowEvent) {
            System.out.format("%s%n", overflowEvent);
        }

        @Override
        public void onWin(WinEvent winEvent) {
            System.out.format("%s%n", winEvent);
        }
    }



    public static void run() {
        ObservedGame game = new ObservedGame();
        game.add(new ExampleObserver());
        play(game);

        ExtendedObservedGame extendedGame = new ExtendedObservedGame();
        extendedGame.add(new ExampleObserver());
        play(extendedGame);


        SixSidedDiceShaker shaker = new SixSidedDiceShaker();
        Stack<Command> commands = new Stack<>();
        ShakeCommand command = new ShakeCommand(shaker, game);
        command.execute();
        commands.push(command);

        command = new ShakeCommand(shaker, game);
        command.execute();
        commands.push(command);

        commands.pop().undo();
        commands.pop().undo();
    }

    private static void play(Game game)
    {
        game.advance(1);
        game.advance(1);
        game.advance(1);
        game.advance(1);
        game.advance(1);
        game.advance(1);

        game.advance(3);
        game.advance(3);
        game.advance(2);
        game.advance(3);
        game.advance(5);
        game.advance(9);

        game.reset();
    }

}
