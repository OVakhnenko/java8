package function;

import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Function2::parse;
        Integer integer = toInteger.apply("5");
        System.out.println(integer);
    }

    private static Integer parse(String s) {
        return Integer.parseInt(s);
    }
}
