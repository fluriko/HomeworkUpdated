package mate.academy.hw8;

import java.util.stream.IntStream;

public class PseudoRandomNumbers {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> (n * n / 10) % 1000);
    }
}
