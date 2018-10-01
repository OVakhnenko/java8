package function;

import domain.User;
import interfaces.UserFactory;

public class Function3 {
    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        User user = userFactory.create("John", 33);
        System.out.println(user);
    }
}
