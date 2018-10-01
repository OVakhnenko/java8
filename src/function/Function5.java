package function;

import domain.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Function5 {
    public static void main(String[] args) {
        List<Person> users = new ArrayList<>();
        users.add(new Person("Nick", "Boll"));
        users.add(new Person("Jan", "Nicky"));
        users.add(new Person("Bot", "Smart"));

        users.sort(Comparator.comparing(Person::getName));
        users.forEach(System.out::println);
    }
}
