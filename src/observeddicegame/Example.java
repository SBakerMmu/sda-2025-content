package observeddicegame;

import java.util.Stack;

public final class Example {

    private static class ExampleObserver implements ExtendedGameBoardObserver
    {

        @Override
        public void onEvent(OverflowEvent overflowEvent) {
            System.out.format("%s%n", overflowEvent);
        }

        @Override
        public void onEvent(UnderflowEvent overflowEvent) {
            System.out.format("%s%n", overflowEvent);
        }

        @Override
        public void onEvent(HomeEvent homeEvent) {
            System.out.format("%s%n", homeEvent);
        }

        @Override
        public void onEvent(PositionSetEvent setEvent) {
            System.out.format("%s%n", setEvent);
        }
    }



    public static void run() {
        NonObservedGameBoard nonObservedGameBoard = new NonObservedGameBoard();
        play(nonObservedGameBoard);

        ObservedGameBoard game = new ObservedGameBoard();
        game.add(new ExampleObserver());
        play(game);

        ExtendedObservedGameBoard extendedGame = new ExtendedObservedGameBoard();
        extendedGame.add(new ExampleObserver());
        play(extendedGame);

        SixSidedDiceShaker shaker = new SixSidedDiceShaker();
        Stack<Command> commands = new Stack<>();
        ShakeCommand command = new ShakeCommand(shaker, extendedGame);
        command.execute();
        commands.push(command);

        command = new ShakeCommand(shaker, extendedGame);
        command.execute();
        commands.push(command);

        commands.pop().undo();
        commands.pop().undo();
    }

    private static void play(GameBoard game)
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
