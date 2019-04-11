package mate.academy.hw8;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

// https://stepik.org/lesson/12781/step/12?thread=solutions&unit=3128
public class MinMaxFinder {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T [] array =(T []) stream.sorted(order).toArray();
        if (array.length == 0) {
            minMaxConsumer.accept(null,null);
        } else {
            minMaxConsumer.accept(array[0],array[array.length-1]);
        }
    }
}
