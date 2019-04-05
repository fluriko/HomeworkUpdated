package mate.academy.stepic;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

// topic 6 https://stepik.org/lesson/Stream-API-12781/step/12?unit=3128
public class StreamFinder {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T [] array =(T []) stream.sorted(order).toArray();
        if(array == null || array.length == 0) {
            minMaxConsumer.accept(null,null);
        } else {
            minMaxConsumer.accept(array[0],array[array.length-1]);
        }
    }
}
