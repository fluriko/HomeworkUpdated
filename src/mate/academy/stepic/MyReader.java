package mate.academy.stepic;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class MyReader {
    // topic 5.3.1 https://stepik.org/lesson/%D0%9F%D0%BE%D1%82%D0%BE%D0%BA%D0%B8-%D1%81%D0%B8%D0%BC%D0%B2%D0%BE%D0%BB%D0%BE%D0%B2-12784/step/12?unit=3131
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter writer = new StringWriter();
        int data;
        while ((data = reader.read()) != -1) {
            writer.write(data);
        }
        return writer.toString();
    }

    // topic 5.3.2 https://stepik.org/lesson/%D0%9F%D0%BE%D1%82%D0%BE%D0%BA%D0%B8-%D1%81%D0%B8%D0%BC%D0%B2%D0%BE%D0%BB%D0%BE%D0%B2-12784/step/13?unit=3131
    public static void filter() {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf(Locale.ENGLISH, "%.6f", result);
    }
}
