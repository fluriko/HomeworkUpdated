package mate.academy.hw7.dao;

import mate.academy.hw7.di.Component;
import mate.academy.hw7.model.Client;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileClientDao implements ClientDao {
    @Override
    public void save(Client client) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("storage.dat"))) {
            objectOutputStream.writeObject(client);
        } catch (IOException e) {
            System.out.println("Не удалось записать клиента в базу");
        }
    }

    @Override
    public List<Client> get() {
        try (ObjectInputStream inputObjectStream = new ObjectInputStream(new FileInputStream("storage.dat"))) {
            List<Client> result = new ArrayList<>();
            result.add((Client) inputObjectStream.readObject());
            return result;
        } catch (Exception e) {
            throw new NotFoundInSystemException("Клиент не найден в системе");
        }
    }
}
