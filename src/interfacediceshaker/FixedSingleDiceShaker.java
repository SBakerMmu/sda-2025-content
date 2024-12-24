package interfacediceshaker;

class FixedSingleDiceShaker implements DiceShaker{

    private final int[]  shakes = new int []{
            1,2,3,4,5,6
    };

    private int index;


    @Override
    public int shake() {
        //reset
        if(index == shakes.length)
        {
            index = 0;
        }
        return shakes[index++];
    }
}
