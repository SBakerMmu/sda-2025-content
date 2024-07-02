package globaltradeitemnumber;

public class InvalidNumberRangeException extends InvalidException {
    public InvalidNumberRangeException(int value, int min, int max) {
        super(String.format("Expected %d to be between %d and %d",value, min,max));
    }
}
