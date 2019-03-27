package mate.academy.hw2;

import java.io.Serializable;

// задание 2.6
public class Triangle implements Serializable {
    public Triangle() {
        this(5);
    }

    public Triangle(int size) {
        this.size = size;
    }

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "size: " + getSize();
    }
}
