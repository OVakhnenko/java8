package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamH {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("BLOB", "Java is the best", "Java 8", "Java 9", "Jacoco");

        Optional<String> java1 = strings.stream()
                .findAny();

        System.out.println(java1); //output Optional[BLOB]

        Optional<String> java2 = strings.stream()
                .filter(s -> s.contains("Java"))
                .findAny();

        System.out.println(java2); //output Optional[Java is the best]

        Optional<String> java3 = strings.parallelStream() // sequential()
                .filter(s -> s.contains("Java"))
                .findAny();

        System.out.println(java3); //output Optional[Java 9]
    }
}
