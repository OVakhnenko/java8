package streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamR {
    public static void main(String[] args) {
        int intSum = IntStream.of(1, 2).sum(); // 3
        long longSum = LongStream.of(3, 4).sum(); // 7
        double doubleSum = DoubleStream.of(5, 6).sum(); // 11

        OptionalDouble intAverage = IntStream.of(1, 2).average(); // 1.5
        OptionalDouble longAverage = LongStream.of(3, 4).average(); // 3.5
        OptionalDouble doubleAverage = DoubleStream.of(5, 6).average(); // 5.5
    }
}
