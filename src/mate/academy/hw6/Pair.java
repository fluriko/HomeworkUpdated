package mate.academy.hw6;

import java.util.NoSuchElementException;
import java.util.Objects;

// topic 6.1 https://stepik.org/lesson/12775/step/12?unit=3123
class Pair<T, E> {
    private final T firstElement;
    private final E secondElement;

    private Pair() {
        this(null, null);
    }

    private Pair(T firstElement, E secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    private void check(Object object) {
        if (object == null) {
            throw new NoSuchElementException("Element does not exist");
        }
    }

    public T getFirst() {
        check(firstElement);
        return firstElement;
    }

    public E getSecond() {
        check(secondElement);
        return secondElement;
    }

    public static <T, E> Pair<T, E> of(T firstElement, E secondElement) {
        return new Pair<>(firstElement, secondElement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstElement, pair.firstElement) &&
                Objects.equals(secondElement, pair.secondElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstElement, secondElement);
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        System.out.println("First element is: ");
        System.out.println(pair.getFirst());
        System.out.println("Second element is: ");
        System.out.println(pair.getSecond());

        Pair<Integer, String> another = Pair.of(1, "hello");
        System.out.println("Equality of pair and another:");
        System.out.println(pair.equals(another));
        System.out.println("Equality of pair's and another's hash code:");
        System.out.println(pair.hashCode() == another.hashCode());
    }
}
