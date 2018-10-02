package streams;

import domain.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamL {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");

        strings.stream()
                .distinct()
                .forEach(System.out::println); //output a b c d

        List<Person> people = Arrays.asList(new Person("Jo"),
                new Person("Zai"),
                new Person("Lui"));

        people.stream()
                //.sorted() //java.lang.ClassCastException if Person do not realize interface Comparable
                .sorted(Comparator.comparing(Person::getName)) //сортировка по имени
                //.sorted(Comparator.comparing(Person::getName).reversed()) //сортировка по имени в обратном порядке
                .forEach(System.out::println);
    }

}
