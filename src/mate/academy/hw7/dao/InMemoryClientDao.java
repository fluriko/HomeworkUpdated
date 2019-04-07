package mate.academy.hw7.dao;

import mate.academy.hw7.di.Component;
import mate.academy.hw7.model.Client;
import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryClientDao implements ClientDao {
    private static final List<Client> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(Client client) {
        inMemoryStorage.add(client);
    }

    @Override
    public List<Client> get() {
        return inMemoryStorage;
    }
}
