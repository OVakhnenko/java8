package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Arya", "Sansa");
        Set<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(upperCaseNames); //output [ARYA, JOHN, SANSA]
    }
}
