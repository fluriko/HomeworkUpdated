package mate.academy.hw11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCounter {
    public static void main(String[] args) {
        count();
    }

    public static void count() {
        Map<String, Long> map = mapMaker(arrayMaker(readSystemIn()));
        map.entrySet()
                .stream()
                .sorted(comparatorMaker())
                .limit(10)
                .forEach((n) -> System.out.println(n.getKey()));
    }

    private static String readSystemIn() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String[] arrayMaker(String line) {
        String[] strings = line.replaceAll("[^\\p{L}\\p{Digit}]+", " ")
                .toLowerCase()
                .split(" ");
        return strings;
    }

    private static Map<String, Long> mapMaker(String[] strings) {
        Map<String, Long> map = Arrays.stream(strings)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map;
    }

    private static Comparator<Map.Entry<String, Long>> comparatorMaker() {
        Comparator<Map.Entry<String, Long>> comparator = Comparator.<Map.Entry<String, Long>>
                comparingLong((n) -> n.getValue())
                .reversed()
                .thenComparing((n) -> n.getKey());
        return comparator;
    }
}

