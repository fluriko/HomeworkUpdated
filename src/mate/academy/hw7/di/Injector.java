package mate.academy.hw7.di;

import mate.academy.hw7.dao.*;
import mate.academy.hw7.factory.ClientDaoFactory;
import mate.academy.hw7.factory.HumanDaoFactory;
import mate.academy.hw7.handler.ConsoleHandler;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileClientDaoClass = FileClientDao.class;
        Class inMemoryClientDaoClass = InMemoryClientDao.class;
        Class fileHumanDaoClass = FileHumanDao.class;
        Class inMemoryHumanDaoClass = InMemoryHumanDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                if (field.getName().equals("clientDao")) {
                    boolean fileDao = fileClientDaoClass.isAnnotationPresent(Component.class);
                    if (fileDao) {
                        System.out.println("Client: Работа с файлами разрешена");
                    }
                    boolean inMemoryDao = inMemoryClientDaoClass.isAnnotationPresent(Component.class);
                    if (inMemoryDao) {
                        System.out.println("Client: Работа с ОЗУ разрешена");
                    }
                    ClientDao clientDao = ClientDaoFactory.getDao(fileDao, inMemoryDao);
                    field.set(null, clientDao);
                }
                if (field.getName().equals("humanDao")) {
                    boolean fileDao = fileHumanDaoClass.isAnnotationPresent(Component.class);
                    if (fileDao) {
                        System.out.println("Human: Работа с файлами разрешена");
                    }
                    boolean inMemoryDao = inMemoryHumanDaoClass.isAnnotationPresent(Component.class);
                    if (inMemoryDao) {
                        System.out.println("Human: Работа с ОЗУ разрешена");
                    }
                    HumanDao humanDao = HumanDaoFactory.getDao(fileDao, inMemoryDao);
                    field.set(null, humanDao);
                }
            }
        }
    }
}

