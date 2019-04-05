package mate.academy.stepic;

import java.io.IOException;
import java.io.InputStream;

// topic 5.2.1 https://stepik.org/lesson/%D0%9F%D0%BE%D1%82%D0%BE%D0%BA%D0%B8-%D0%B1%D0%B0%D0%B9%D1%82-12783/step/8?unit=3130
public class Control {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int current = inputStream.read();
        while (current != -1) {
            result = Integer.rotateLeft(result, 1) ^ result;
            current = inputStream.read();
        }
        return result;
    }
}

