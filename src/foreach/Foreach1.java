package foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(number -> System.out.println(number));
        numbers.forEach(System.out::println);

        numbers.forEach(number -> {
            if (number > 2) {
                System.out.println(number);
            }
        });
    }
}
