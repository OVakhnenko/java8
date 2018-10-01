package streams;

import java.util.Arrays;
import java.util.List;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);

        numbers.stream()
                .map(i -> i * 2)
                .forEach(System.out::println); //output 2 6 10 14
    }
}
