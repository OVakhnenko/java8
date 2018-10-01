package interfaces;

import domain.User;

public interface UserFactory {
    User create(String name, int age);
}
