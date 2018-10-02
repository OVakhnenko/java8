package streams;

import domain.HumanWithPats;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamF {
    public static void main(String[] args) {
        List<HumanWithPats> humans = Arrays.asList(
                new HumanWithPats("Sam", Arrays.asList("Buddy", "Lucy")),
                new HumanWithPats("Bob", Arrays.asList("Frankie", "Rosie")),
                new HumanWithPats("Marta", Arrays.asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                //.map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                //.flatMap(pets -> pets.stream()) //"разворачиваем" Stream<List<Pet>> в Stream<Pet>
                //.collect(Collectors.toList());
                .flatMap(human -> human.getPets().stream())
                .collect(Collectors.toList());

        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]
    }
}
