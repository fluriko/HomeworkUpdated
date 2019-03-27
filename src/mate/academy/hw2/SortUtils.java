package mate.academy.hw2;

// задание 2.3
public class SortUtils {

    // метода для создания рандомных массивов
    public static int[] setArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // метод для перестановки элеметнов
    public static int[] swap(int indexA, int indexB, int[] array) {
        int buffer = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = buffer;
        return array;
    }

    // сортировка пузырьком
    public static int[] sortBubble(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1, array);
                }
            }
        }
        return array;
    }

    // сортировка слиянием
    public static int[] arraysMerge(int[] leftArray, int[] rightArray) {
        int start = 0;
        int end = 0;
        int[] result = new int[leftArray.length + rightArray.length];
        for (int i = 0; i < result.length; i++) {
            if ((end < rightArray.length) && (start < leftArray.length)) {
                if (leftArray[start] > rightArray[end]) {
                    result[i] = rightArray[end];
                    end++;
                } else {
                    result[i] = leftArray[start];
                    start++;
                }
            } else if (end < rightArray.length) {
                result[i] = rightArray[end];
                end++;
            } else {
                result[i] = leftArray[start];
                start++;
            }
        }
        return result;
    }

    public static int[] sortMerge(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            int[] leftSortedArray = sortMerge(array, start, middle);
            int[] rightSortedArray = sortMerge(array, middle + 1, end);
            return arraysMerge(leftSortedArray, rightSortedArray);
        }
        return new int[] {array[start]};
    }
}