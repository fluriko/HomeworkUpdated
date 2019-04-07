package mate.academy.hw7.dao;

import mate.academy.hw7.di.Component;
import mate.academy.hw7.model.Human;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileHumanDao implements HumanDao {
    @Override
    public void save(Human human) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("humans.dat"))) {
            objectOutputStream.writeObject(human);
        } catch (IOException e) {
            System.out.println("Не удалось записать человека в базу");
        }
    }

    @Override
    public List<Human> get() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("humans.dat"))) {
            List<Human> result = new ArrayList<>();
            result.add((Human) objectInputStream.readObject());
            return result;
        } catch (Exception e) {
            throw new NotFoundInSystemException("Человек не найден в системе");
        }
    }
}
