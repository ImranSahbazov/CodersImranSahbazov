package Tasks12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> evenNumberPredicate = num -> num % 2 == 0;

        List<Integer> evenNumbersList = filterList(integerList, evenNumberPredicate);
        System.out.println("Cut ededler: " + evenNumbersList);
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}

