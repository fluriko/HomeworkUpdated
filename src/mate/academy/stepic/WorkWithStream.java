package mate.academy.stepic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// topic 6
public class WorkWithStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8")
                .useDelimiter("[^\\p{L}\\p{Digit}]+");
        Map<String, Integer> map = new HashMap<>();
        scanner.forEachRemaining(s -> map.merge(s.toLowerCase(), 1, (a, b) -> a + b));
        map.entrySet()
                .stream()
                .sorted(descendingFrequencyOrder())
                .limit(10).map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    private static Comparator<Map.Entry<String, Integer>> descendingFrequencyOrder() {
        return Comparator.<Map.Entry<String, Integer>> comparingInt(Map.Entry::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey);
    }
}
