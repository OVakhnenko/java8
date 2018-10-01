package streams;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Stream5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "arya", "sansa");

        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println); //output John Arya Sansa
    }
}
