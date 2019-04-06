package mate.academy.hw7.model;

import java.io.Serializable;

public class Human implements Serializable {
    private String name;
    private String age;

    public Human(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
