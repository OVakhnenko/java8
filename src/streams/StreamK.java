package streams;

import java.util.Arrays;
import java.util.List;

public class StreamK {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        boolean match1 = numbers1.stream()
                .anyMatch(number -> number % 2 == 0); // есть ли в Stream-e четное число
        System.out.println(match1); //output true

        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7);
        boolean match2 = numbers2.stream()
                .anyMatch(number -> number % 2 == 0); // есть ли в Stream-e четное число
        System.out.println(match2); //output false

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        boolean match3 = numbers3.stream()
                .allMatch(number -> number % 2 == 0); // все ли числа в Stream-e четные
        System.out.println(match3); //output false

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        boolean match4 = numbers4.stream()
                .allMatch(number -> number > 0); // все ли числа в Stream-e положительные
        System.out.println(match4); //output true

        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        boolean match5 = numbers5.stream()
                .noneMatch(number -> number % 2 == 0); // все ли числа в Stream-e НЕ четные
        System.out.println(match5); //output false
    }
}
