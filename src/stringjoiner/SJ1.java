package stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class SJ1 {
    public static void main(String[] args) {
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("John");
        joiner1.add("Danny");
        joiner1.add("Lui");
        System.out.println(joiner1.toString()); //output John, Danny, Lui

        StringJoiner joiner2 = new StringJoiner(". ", "(", ")");
        joiner2.add("John");
        joiner2.add("Danny");
        joiner2.add("Lui");
        System.out.println(joiner2.toString()); //output (John. Danny. Lui)

        String numbers1 = String.join("-", "1", "0", "1", "0");
        System.out.println(numbers1); //output 1-0-1-0

        List<String> databases1 = Arrays.asList("OracleDB", "Mongo", "PostgreSQL", "MySQL");
        String string1 = String.join(", ", databases1);
        System.out.println(string1); //output OracleDB, Mongo, PostgreSQL, MySQL

        List<String> frameworks1 = Arrays.asList("Spring", "Hibernate", "JPA", "JSF");
        String collect1 = frameworks1.stream()
                .collect(Collectors.joining("; "));
        System.out.println(collect1); //output Spring; Hibernate; JPA; JSF

        List<String> list = Arrays.asList("Angular", "Bootstrap", "NodeJS", "Django");
        String collect = list.stream()
                .collect(Collectors.joining("; ", "{", "}"));
        System.out.println(collect); //output {Angular; Bootstrap; NodeJS; Django}
    }
}
