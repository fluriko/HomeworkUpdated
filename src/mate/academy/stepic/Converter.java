package mate.academy.stepic;

import java.io.IOException;

// topic 5.2.2 https://stepik.org/lesson/%D0%9F%D0%BE%D1%82%D0%BE%D0%BA%D0%B8-%D0%B1%D0%B0%D0%B9%D1%82-12783/step/9?unit=3130
public class Converter {
    private static final byte THIRTEEN  = 13;
    private static final byte TEN = 10;

    public static void main(String[] args) {
        try {
            int current;
            int previous;
            previous = System.in.read();
            while (previous != -1) {
                current = System.in.read();
                if (previous != THIRTEEN || current != TEN)
                    System.out.write(previous);
                previous = current;
            }
            System.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
