package Tasks16;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class randomNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int limit = 100;
        int count = 100;

        List<Integer> numbers = random.ints(count, 1, limit + 1)
                .boxed().toList();

        Map<Integer, Long> numberCounts = numbers.stream()
                .collect(Collectors.groupingBy(
                        number -> number,
                        Collectors.counting()
                ));

        numberCounts.forEach((number, numCount) -> System.out.println(number + " tekrar sayısı: " + numCount));
    }
}


