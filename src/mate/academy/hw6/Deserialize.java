package mate.academy.hw6;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

// https://stepik.org/lesson/12785/step/8?unit=3132
public class Deserialize {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Animal[] animals = new Animal[inputStream.readInt()];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) inputStream.readObject();
            }
            return animals;
        }
        catch (Exception ex) {
            throw new IllegalArgumentException();
        }
    }
}

// класс который будем десериализовать
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
