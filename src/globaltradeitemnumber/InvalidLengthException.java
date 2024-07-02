package globaltradeitemnumber;

public class InvalidLengthException extends InvalidException {

    public InvalidLengthException(String s, int maxLength) {
        super(String.format("expected length %d", maxLength));
    }

}
