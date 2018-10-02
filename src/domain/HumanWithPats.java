package domain;

import java.util.List;

public class HumanWithPats {
    private final String name;
    private final List<String> pets;

    public HumanWithPats(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "HumanWithPats{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
