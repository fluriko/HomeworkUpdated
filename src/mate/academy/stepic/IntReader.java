package mate.academy.stepic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// topic 6 https://stepik.org/lesson/%D0%9A%D0%BE%D0%BB%D0%BB%D0%B5%D0%BA%D1%86%D0%B8%D0%B8-12776/step/15?unit=3124
public class IntReader {
    public static void main(String[] args) {
        System.out.println("Введите последовательность целых чисел:\n");
        List<Integer> list = new ArrayList<Integer>(){
            @Override
            public String toString() {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < size(); i++) {
                    result.append(" ").append(get(i));
                }
                return result.toString();
            }
        };
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; scanner.hasNextInt(); i++) {
            if (i % 2 != 0) {
                list.add(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
