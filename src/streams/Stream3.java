package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Stream3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Daenerys", "Tyrion", "", null, "Arya");

        names.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);
    }
}
