package mate.academy.hw7.factory;

public class ComponentNotFoundException extends RuntimeException {
    public ComponentNotFoundException() {}

    public ComponentNotFoundException(String message) {
        super(message);
    }
}
