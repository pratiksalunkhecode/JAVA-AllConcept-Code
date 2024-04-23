package ExceptionHandling;

public class invalidAgeException extends Exception{

    String message;

    public invalidAgeException(String message) {

        super(message);

    }
}
