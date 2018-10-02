package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 12, 15);

        Optional<Integer> first1 = numbers.stream().findFirst();
        System.out.println(first1); //output Optional[1]

        Optional<Integer> first2 = numbers.stream().filter(number -> number > 10).findFirst();
        System.out.println(first2); //output Optional[12]

        Optional<Integer> first3 = numbers.parallelStream().filter(number -> number > 10).findFirst();
        System.out.println(first3); //output Optional[12]
    }
}
