package mate.academy.hw1;

// задание 1.6
public class Matrix {
    public static double max(double[][] array) {
        double result = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (result < array[i][j]) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    public static double min(double[][] array) {
        double result = Double.POSITIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (result > array[i][j]) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // проверка работы метода:
        double[][] array = new double[][] {{1, 2, 3}, {2, 3, 7}, {4, 8, 1}};
        System.out.println("Максимальное значение в матрице array = " + max(array));
        System.out.println("Минимальное значение в матрице array = " + min(array));
    }
}
