package streams;

import domain.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamD {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned", "Stark", 1),
                new Human("Robb", "Stark", 2),
                new Human("Arya", "Stark", 1),
                new Human("Aegon", "Targaryen", 6),
                new Human("Daenerys", "Targaryen", 4),
                new Human("Jaime", "Lannister", 1),
                new Human("Tyrion", "Lannister", 3));

        Map<String, Integer> map = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname, Collectors.summingInt(Human::getFriendsAmount)));

        System.out.println(map); //output {Lannister=4, Targaryen=10, Stark=4}
    }
}
