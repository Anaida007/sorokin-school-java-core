package school.sorokin.javacore.exception.custom_exception;

public class InvalidRoomNumberException extends RuntimeException {

    public InvalidRoomNumberException(String message) {
        super(message);
    }
}
