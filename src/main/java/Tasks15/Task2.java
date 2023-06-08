package Tasks15;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String input = "salam 123 salam 3 89";
        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();
            Optional<Integer> number = parseInteger(match);
            number.ifPresent(System.out::println);
        }
    }

    private static Optional<Integer> parseInteger(String str) {
        try {
            int value = Integer.parseInt(str);
            return Optional.of(value);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}

