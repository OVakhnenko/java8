package optional;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<String> name1 = Optional.of("John");
        System.out.println(name1); //output Optional[John]

        //Optional<String> name2 = Optional.of(null); // java.lang.NullPointerException

        String john = null;
        Optional<String> name2 = Optional.ofNullable(john);
        System.out.println(name2); //output Optional.empty

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional); //output Optional.empty

        Optional<String> name3 = Optional.of("John");
        System.out.println(name3.get()); //output John

        //Optional<Object> nullOptional = Optional.ofNullable(null);
        //System.out.println(nullOptional.get()); // java.util.NoSuchElementException: No value present

        Optional<String> name4 = Optional.of("John");
        if (name4.isPresent()) {             //условие выполнится и мы увидим имя
            System.out.println(name4.get()); //output John
        }

        Optional<Object> empty1 = Optional.empty();
        if (empty1.isPresent()) {            //условие не выполнится, значит исключения не будет
            System.out.println(empty1.get());
        }

        Optional<String> name5 = Optional.of("John");
        System.out.println(name5.orElse("blank")); //output John

        Optional<Object> empty2 = Optional.empty();
        System.out.println(empty2.orElse("blank")); //output blank

        Optional<String> name6 = Optional.of("John");
        System.out.println(name6.orElseGet(() -> "blank")); //output John

        Optional<Object> empty3 = Optional.empty();
        System.out.println(empty3.orElseGet(() -> "blank")); //output blank

        Optional<String> name = Optional.of("JOHN");
        System.out.println(name.map(String::toLowerCase));  //output Optional[john]

        Optional<String> empty = Optional.empty();
        System.out.println(empty.map(String::toLowerCase)); //output Optional.empty
    }
}
