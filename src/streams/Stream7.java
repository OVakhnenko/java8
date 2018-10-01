package streams;

import domain.Car;

import java.util.Arrays;
import java.util.List;

public class Stream7 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        cars.stream()
                .filter(c -> c.getYear() > 2010) // выбираем только машины, выпущенные после 2010 года
                .map(Car::getNumber) // преобразовываем Машины в номера, теперь у нас Stream номеров машин
                .filter(s -> s != null && !s.isEmpty()) // выбираем только не пустые номера
                .forEach(System.out::println); // выводим результат
    }
}
