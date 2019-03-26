package mate.academy.hw1;

// задание 1.7
public class CloneOverrideTest {
    public static void main(String[] args) {
        Person man = new Person("Alex");
        CloneOverride origin = new CloneOverride(1, "Origin version", man);
        CloneOverride clone = null;
        try {
            clone = (CloneOverride) origin.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(origin);
        System.out.println(clone);
    }
}
