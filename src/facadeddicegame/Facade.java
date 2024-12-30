package facadeddicegame;

class Facade implements FacadeInterface {
    @Override
    public int play() {
        DiceShaker shaker = new SingleDiceShaker();
        GameBoard game = new GameBoard();
        game.advance(shaker.shake());
        while(!game.isHome())
        {
            game.advance(shaker.shake());
        }
        return game.getMoves();
    }
}
