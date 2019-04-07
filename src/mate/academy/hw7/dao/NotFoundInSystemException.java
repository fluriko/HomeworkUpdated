package mate.academy.hw7.dao;

public class NotFoundInSystemException extends RuntimeException {
    public NotFoundInSystemException() {}

    public NotFoundInSystemException(String message) {
        super(message);
    }
}
