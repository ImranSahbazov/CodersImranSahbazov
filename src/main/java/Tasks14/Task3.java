package Tasks14;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        String s = "isteyirdim sorusam perverdigardan goresen dunyaya nos gelib insan";

        Map<Character, Long> duplicateChars = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        duplicateChars.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}

