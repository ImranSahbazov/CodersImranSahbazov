package Tasks14;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8);

        List<Integer> commonElements = list1.stream()
                .filter(list2::contains)
                .distinct().toList();

        System.out.println("oxsar ededler: " + commonElements);

    }
}
