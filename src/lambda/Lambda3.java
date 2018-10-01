package lambda;

import domain.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21));

        System.out.println("Before sort:");
        for (User user : users) {
            System.out.println(user);
        }

        Comparator<User> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
        users.sort(comparator.reversed());

        System.out.println("\nAfter sort:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
