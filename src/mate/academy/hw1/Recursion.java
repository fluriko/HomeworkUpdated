package mate.academy.hw1;

// задание 1.4
public class Recursion {
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        int result = factorial(number - 1) * number;
        return result;
    }

    public static double taylor(int index, int value) {
        if (index == 0) {
            return 1;
        }
        double negativeOnePowered = Math.pow(-1, index);
        double indexFactorial = factorial(index * 2);
        double valuePowered = Math.pow(value, 2 * index);
        double recursion = taylor(index - 1, value);
        double result = (negativeOnePowered / indexFactorial) *  valuePowered + recursion;
        return result;
    }

    public static void main(String[] args) {
        // проверка работы метода:
        System.out.println("8 число Фибоначчи = " + fibonacci(8));
        System.out.println("Факториал 6  = " + factorial(6));
        System.out.println("Ряд Тейлора 1 с индексом 2 = " + taylor(2, 1));
    }
}