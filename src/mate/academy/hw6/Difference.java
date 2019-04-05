package mate.academy.hw6;

import java.util.HashSet;
import java.util.Set;

// topic 6.2.1 https://stepik.org/lesson/12775/step/12?unit=3123
public class Difference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> first = new HashSet<>(set1);
        Set<T> second = new HashSet<>(set2);
        first.removeAll(set2);
        second.removeAll(set1);
        first.addAll(second);
        return first;
    }

    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);
        Set<Integer> second = new HashSet<>();
        second.add(0);
        second.add(1);
        second.add(2);
        System.out.println("First set:\n" + first);
        System.out.println("Second set:\n" + second);
        System.out.println("Symmetric difference between first and second sets:");
        System.out.println(symmetricDifference(first, second));
    }
}
