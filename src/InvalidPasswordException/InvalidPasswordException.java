package InvalidPasswordException;

public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String messages){
        super(messages);
    }
}
