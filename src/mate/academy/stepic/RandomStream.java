package mate.academy.stepic;

import java.util.stream.IntStream;

// topic 6 https://stepik.org/lesson/Stream-API-12781/step/11?unit=3128
public class RandomStream {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> (n * n / 10) % 1000);
    }
}
