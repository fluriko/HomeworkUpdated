package mate.academy.hw7.dao;

import mate.academy.hw7.di.Component;
import mate.academy.hw7.model.Human;
import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryHumanDao implements HumanDao {
    private static final List<Human> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(Human human) {
        inMemoryStorage.add(human);
    }

    @Override
    public Human get() {
        return inMemoryStorage.get(0);
    }
}
