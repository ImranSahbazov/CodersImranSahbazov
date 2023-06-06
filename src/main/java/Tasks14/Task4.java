package Tasks14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

    }
}
