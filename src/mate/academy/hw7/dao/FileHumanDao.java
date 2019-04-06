package mate.academy.hw7.dao;

import mate.academy.hw7.di.Component;
import mate.academy.hw7.model.Human;
import java.io.*;

@Component
public class FileHumanDao implements HumanDao {
    @Override
    public void save(Human human) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("humans.dat"))) {
            objectOutputStream.writeObject(human);
        } catch (IOException e) {
            System.out.println("Fail in human serialization");
        }
    }

    @Override
    public Human get() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("humans.dat"))) {
            return (Human) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("Fail in deserialization");
            return null;
        }
    }
}
