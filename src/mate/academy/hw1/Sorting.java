package mate.academy.hw1;

import java.util.Arrays;

// задание 1.5
public class Sorting {
    private int[] array;

    public Sorting(int length) {
        setArray(length);
    }

    public void setArray(int length) {
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void swap(int indexA, int indexB, int[] array) {
        int buffer = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = buffer;
    }

    public void sort1() {
        sort1(array);
    }

    public void sort1(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j,j + 1, array);
                }
            }
        }
    }

    public void sort2() {
        sort2(array);
    }

    public void sort2(int[] array) {
        Arrays.sort(array);
    }

    public void sort3() {
        sort3(array);
    }

    public void sort3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(i, minIndex, array);
            }
        }
    }

    public void sort4() {
        sort4(array);
    }

    public void sort4(int[] array) {
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    swap(i, i - 1, array);
                }
            }
            left++;
        } while (left < right);
    }

    public void sort5() {
        sort5(array);
    }

    public void sort5(int[] array) {
        int index = 1;
        while(index < array.length) {
            if((index == 0) || (array[index - 1] <= array[index]))
                index++;
            else {
                swap(index, index - 1,array);
                index--;
            }
        }
    }
}
