package streams;

import domain.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamC {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned", "Stark", 1),
                new Human("Robb", "Stark", 2),
                new Human("Arya", "Stark", 1),
                new Human("Aegon", "Targaryen", 6),
                new Human("Daenerys", "Targaryen", 4),
                new Human("Jaime", "Lannister", 1),
                new Human("Tyrion", "Lannister", 3));

        Map<String, Long> map = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname, Collectors.counting()));

        System.out.println(map); //output {Lannister=2, Targaryen=2, Stark=3}
    }
}
