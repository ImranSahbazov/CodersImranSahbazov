package Tasks16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("imran", "ilkin", "lalalal", "fafafa", "resad");


        List<String> filteredList = list.stream().filter(i -> i.chars().distinct().count()>3).toList();

        List<String> sortedList =filteredList.stream().sorted(Comparator.comparing(String::length)).toList();

        List<String> biggerCase = sortedList.stream().map(i->i.toUpperCase()).toList();

        System.out.println(biggerCase);




    }

}
