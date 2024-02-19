package apps;

public class InvalidAccountException extends Exception{
    public  InvalidAccountException(String exceptionMessage){
        super(exceptionMessage);
    }
}
