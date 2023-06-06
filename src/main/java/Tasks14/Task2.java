package Tasks14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {

        String text = "isteyirdim sorusam perverdigardan goresen dunyaya nos gelib insan";

        String longestWord = Arrays.stream(text.split(" "))
                .max(Comparator.comparing(String::length)).orElse("");
        System.out.println(longestWord);
    }
}
