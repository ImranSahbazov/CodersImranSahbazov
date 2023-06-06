package Tasks14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = IntStream.range(1, 20)
                .filter(n -> n % 2 == 0).boxed().toList();

        System.out.println("cut ededler: " + evenNumbers);
    }
}
