package mate.academy.hw7.dao;

import mate.academy.hw7.model.Client;

public interface ClientDao {
    void save(Client client);
    Client get();
}
