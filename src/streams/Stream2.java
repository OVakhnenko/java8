package streams;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");

        long count = names.stream()
                .filter(i -> i.length() > 4)
                .count();
        System.out.println(count); //output  3
    }
}
