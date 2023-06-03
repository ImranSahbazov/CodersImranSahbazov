package Tasks12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Salam", "Dünya", "Java", "Coders");

        Function<String, String> uppercaseConverter = str -> str.toUpperCase();

        List<String> convertedList = convertList(stringList, uppercaseConverter);
        System.out.println("Converted List: " + convertedList);
    }

    public static <T, R> List<R> convertList(List<T> list, Function<T, R> converter) {
        List<R> convertedList = new ArrayList<>();
        for (T item : list) {
            R convertedItem = converter.apply(item);
            convertedList.add(convertedItem);
        }
        return convertedList;
    }
}
