package mate.academy.hw1;

public class RhombusRemake {
    public static String drawPart(int count, String part) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(part);
        }
        return result.toString();
    }

    public static String drawTop(int value) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = value; i > 0; i--) {
            result.append(drawPart(i, "  "));
            result.append(drawPart(count, " *  "));
            count++;
            result.append("\n\n");
        }
        return result.toString();
    }

    public static String drawBottom(int value) {
        StringBuilder result = new StringBuilder();
        int count = value - 1;
        for (int i = 2; i <= value; i++) {
            result.append(drawPart(i, "  "));
            result.append(drawPart(count, " *  "));
            count--;
            result.append("\n\n");
        }
        return result.toString();
    }

    public static String drawRhombus(int value) {
        StringBuilder result = new StringBuilder();
        result.append(drawTop(value));
        result.append(drawBottom(value));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(drawRhombus(6));
    }
}