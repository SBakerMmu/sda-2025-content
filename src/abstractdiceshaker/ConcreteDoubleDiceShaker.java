package abstractdiceshaker;

class ConcreteDoubleDiceShaker extends AbstractDiceShaker {
    @Override
    public int shake() {
        //generate number between 1 an 6
        return random.nextInt(12) + 1;
    }
}
