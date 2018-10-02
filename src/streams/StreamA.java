package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class StreamA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue = names.stream()
                .filter(n -> !n.isEmpty())
                //.collect(Collectors.toCollection(() -> new LinkedList<>()));
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(queue); //output [Jaime, Daenerys, Tyrion]
    }
}
