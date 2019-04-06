package mate.academy.hw7.factory;

import mate.academy.hw7.dao.FileHumanDao;
import mate.academy.hw7.dao.HumanDao;
import mate.academy.hw7.dao.InMemoryHumanDao;
import mate.academy.hw7.service.PropertyLoader;
import java.io.IOException;

public class HumanDaoFactory {
    private static final HumanDao inMemoryDao = new InMemoryHumanDao();
    private static final HumanDao fileDao = new FileHumanDao();

    public static HumanDao getDao(boolean isFileDao, boolean isINMemoryDao) {
        try {
            String dbName = PropertyLoader.getProperty("db.name");
            if (dbName.equals("memory") && isINMemoryDao) {
                return inMemoryDao;
            }
        } catch (IOException e) {
            System.out.println("Нет доступа к файлу");
        }
        if (isFileDao) {
            return fileDao;
        } else {
            throw new ComponentNotFoundException();
        }
    }
}
