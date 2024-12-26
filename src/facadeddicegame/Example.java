package facadeddicegame;

public final class Example {


    public static void run() {
        FacadeInterface game = new Facade();
        System.out.format("Game won in %d moves%n", game.play());
    }

}
