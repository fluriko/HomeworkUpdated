package mate.academy.hw7.di;

import mate.academy.hw7.dao.ClientDao;
import mate.academy.hw7.dao.FileClientDao;
import mate.academy.hw7.dao.FileHumanDao;
import mate.academy.hw7.dao.HumanDao;
import mate.academy.hw7.dao.InMemoryClientDao;
import mate.academy.hw7.dao.InMemoryHumanDao;
import mate.academy.hw7.factory.ClientDaoFactory;
import mate.academy.hw7.factory.HumanDaoFactory;
import mate.academy.hw7.handler.ConsoleHandler;
import java.lang.reflect.Field;

public class Injector {
    private static Class consoleHandlerClass = ConsoleHandler.class;
    private static Class fileClientDaoClass = FileClientDao.class;
    private static Class inMemoryClientDaoClass = InMemoryClientDao.class;
    private static Class fileHumanDaoClass = FileHumanDao.class;
    private static Class inMemoryHumanDaoClass = InMemoryHumanDao.class;

    private static void checkClientDao(Field field) throws IllegalAccessException {
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
    }

    private static void checkHumanDao(Field field) throws IllegalAccessException {
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

    public static void injectDependency() throws IllegalAccessException {
        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                checkClientDao(field);
                checkHumanDao(field);
            }
        }
    }
}

