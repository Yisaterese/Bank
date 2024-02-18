package apps;

public class InvalidPinException extends Exception {
    public InvalidPinException(String exceptionMessage){
        super(exceptionMessage);
    }
}
