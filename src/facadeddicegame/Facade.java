package facadeddicegame;

class Facade implements FacadeInterface {
    @Override
    public int play() {
        DiceShaker shaker = new SingleDiceShaker();
        Game game = new Game();
        game.advance(shaker.shake());
        int count = 1;
        while(!game.isHome())
        {
            game.advance(shaker.shake());
            count++;
        }
        return count;
    }
}
