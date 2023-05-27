package tasks8;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);



        List<Integer> newList = tekrarlariSil(list);
        System.out.println(newList);
    }

    public static List<Integer> tekrarlariSil(List<Integer> list) {
        Set<Integer> unikSet = new HashSet<>();
        List<Integer> newList = new ArrayList<>();

        for (Integer element : list) {
            if (unikSet.add(element)) {
                newList.add(element);
            }
        }

        return newList;
    }

}
