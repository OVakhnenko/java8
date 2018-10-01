package streams;

import domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream6 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AM1111BE", 2009),
                new Car("AK5555IT", 2010),
                new Car("AI5601CC", 2015),
                new Car("AI3838PP", 2017));

        cars.stream()
                .map(Car::getNumber) // преобразовываем Stream машин в Stream номеров
                .forEach(System.out::println);
    }
}
