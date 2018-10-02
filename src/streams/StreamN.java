package streams;

import domain.Connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class StreamN {
    public static void main(String[] args) {
        List<Connection> network = Arrays.asList(new Connection("A", "B"),
                new Connection("A", "C"),
                new Connection("A", "D"),
                new Connection("B", "C")
        );

        List<String> identity = new ArrayList<>();

        BiFunction<List<String>, Connection, List<String>> accumulator = (strings, connection) -> {
            strings.add(connection.getTo());
            return strings;
        };

        BinaryOperator<List<String>> combiner = (strings, strings2) -> {
            strings.addAll(strings2);
            return strings;
        };

        List<String> list = network.stream()
                .filter(p -> "A".equals(p.getFrom()))
                .reduce(identity, accumulator, combiner);

        System.out.println(list); //output [B, C, D]
    }
}
