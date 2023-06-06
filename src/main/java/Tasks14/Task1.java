package Tasks14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,23,32, 4, 5};

        int[] reversedArray = IntStream.rangeClosed(1, array.length)
                .map(i -> array[array.length - i]).toArray();

        System.out.println("ters array: " + Arrays.toString(reversedArray));

    }

}
