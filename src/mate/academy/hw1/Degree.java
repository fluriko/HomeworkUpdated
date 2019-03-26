package mate.academy.hw1;

// задание 1.3
public class Degree {
    public static double findDegree(double number, double degree) {
        if ((degree == 0) && (number != 0)) {
            return 1;
        }
        double result = number;
        for (int i = 1; i < Math.abs(degree); i++) {
            result *= number;
        }
        if((degree < 0) && (number != 0)) {
            result = 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        // проверка работы метода:
        System.out.println(findDegree(5, 3)); // 27
        System.out.println(findDegree(5, -3)); // 0.008
    }
}
