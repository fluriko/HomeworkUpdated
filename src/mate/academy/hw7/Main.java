package mate.academy.hw7;

import java.io.IOException;
import mate.academy.hw7.di.Injector;
import mate.academy.hw7.handler.ConsoleHandler;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Injector.injectDependency();
        ConsoleHandler.handle();
    }


}
