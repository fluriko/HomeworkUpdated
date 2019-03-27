package mate.academy.hw2;

import java.util.Arrays;

// задание 2.3
public class SortUtilsTest {
    public static void main(String[] args) {
        // тестировка сортировки пузырьком
        int[] array = SortUtils.setArray(15);
        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString((array)));
        System.out.println("Array after bubble sort: ");
        SortUtils.sortBubble(array);
        System.out.println(Arrays.toString(array));

        // тестировка сортировки слиянием
        int[] arrayM = SortUtils.setArray(15);
        System.out.println("\nArrayM before sort: ");
        System.out.println(Arrays.toString((arrayM)));
        arrayM = SortUtils.sortMerge(arrayM, 0, arrayM.length - 1);
        System.out.println("ArrayM after merge sort: ");
        System.out.println(Arrays.toString(arrayM));
    }
}
