package utils;

public class MyCustomTestException extends Exception {

    public MyCustomTestException() {}

    public MyCustomTestException(String message) {
        super(message);
    }

    public MyCustomTestException(Throwable cause) {
        super(cause);
    }

    public MyCustomTestException(String message, Throwable cause) {
        super(message, cause);
    }
}
