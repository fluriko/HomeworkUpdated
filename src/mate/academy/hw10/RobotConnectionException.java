package mate.academy.hw10;

// task 1: https://stepik.org/lesson/12773/step/7?unit=3121
public class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}

