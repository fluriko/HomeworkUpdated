package mate.academy.hw3;

import java.util.Arrays;

// задание https://stepik.org/lesson/12762/step/9?unit=3110
public class Sorting {
    public static int[] mergeArrays(int[] leftArray, int[] rightArray) {
        int[] resultArray = new int[leftArray.length + rightArray.length];
        int indexOfLeftArray = 0;
        int indexOfRightArray = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (indexOfLeftArray > leftArray.length - 1) {
                resultArray[i] = rightArray[indexOfRightArray];
                indexOfRightArray++;
            }
            else if (indexOfRightArray > rightArray.length - 1) {
                resultArray[i] = leftArray[indexOfLeftArray];
                indexOfLeftArray++;
            }
            else if (leftArray[indexOfLeftArray] < rightArray[indexOfRightArray]) {
                resultArray[i] = leftArray[indexOfLeftArray];
                indexOfLeftArray++;
            }
            else {
                resultArray[i] = rightArray[indexOfRightArray];
                indexOfRightArray++;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] firstArray = new int[] {1, 3, 5};
        int[] secondArray = new int[] {2, 4, 8};
        System.out.println("First array before merge: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Second array before merge: ");
        System.out.println(Arrays.toString(secondArray));
        int[] mergedArray = mergeArrays(firstArray, secondArray);
        System.out.println("Result array after merge: ");
        System.out.println(Arrays.toString(mergedArray));
    }
}
