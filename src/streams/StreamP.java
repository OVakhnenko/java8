package streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamP {
    public static void main(String[] args) {
        //IntStream intStream = IntStream.of(1, 2, 3, 4);
        //LongStream longStream = LongStream.of(5, 6, 7, 8);
        //DoubleStream doubleStream = DoubleStream.of(9, 10, 11, 12);

        //IntStream intStream = IntStream.range(1, 100); // от 1 до 99
        //LongStream longStream = LongStream.range(2, 200); // от 1 до 99
        //DoubleStream doubleStream = DoubleStream.range(3, 300); // метода нет, не компилируется

        IntStream intStream = IntStream.rangeClosed(1, 100); // от 1 до 100
        LongStream longStream = LongStream.rangeClosed(2, 200); // от 1 до 100
        //DoubleStream doubleStream = DoubleStream.rangeClosed(3, 300); // метода нет, не компилируется

        DoubleStream doubleStream = IntStream.rangeClosed(1, 100)
                .asLongStream()
                .asDoubleStream();

        int[] ints = IntStream.of(1, 2).toArray(); // [1, 2]
        long[] longs = LongStream.of(3, 4).toArray(); // [3, 4]
        double[] doubles = DoubleStream.of(5, 6).toArray(); // [5.0, 6.0]


    }
}
