package mate.academy.hw2;

// задание 2.4
public final class Immutable {
    private final String name;
    private final String color;
    private final int number;

    public Immutable(String name, String color, int number) {
        this.name = name;
        this.color = color;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return getName() + ", " + getColor() + ", " + getNumber();
    }

    public static void main(String[] args) {
        Immutable immutable = new Immutable("Freya", "Blue", 16);
        System.out.println(immutable);
    }
}
