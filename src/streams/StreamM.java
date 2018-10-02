package streams;

import domain.Connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class StreamM {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 5);
        Optional<Integer> sum1 = numbers1.stream()
                .reduce((left, right) -> left + right);
        sum1.ifPresent(System.out::println); //output 11

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 5);
        Integer sum2 = numbers2.stream()
                .reduce(10, (left, right) -> left + right);
        System.out.println(sum2); //output 11

        List<Integer> numbers3 = Arrays.asList(1, 2, 3);
        Integer sum3 = numbers3.stream()
                .reduce(10, (identity, val) -> identity * val, (left, right) -> left + right); // 1*10 + 2*10 + 3*10
        System.out.println(sum3); //output 60

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 5, 7);
        Integer min4 = numbers4.stream()
                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);
        System.out.println(min4); //output 1

        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 5, 7);
        Integer min5 = numbers5.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(min5); //output

        List<String> strings6 = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ffff");
        String s6 = strings6.stream()
                .reduce("", (left, right) -> left.length() > right.length() ? left : right);
        System.out.println(s6); //output ffff
    }
}
