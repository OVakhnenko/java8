package function;

import java.util.function.Function;

public class Function4 {
    public static void main(String[] args) {
        Function<String, String> trim = String::trim;
        String str = trim
                .andThen(String::toLowerCase)
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply(" ABCDEFG ");

        System.out.println(str);
        // Output gfedcba
    }
}
