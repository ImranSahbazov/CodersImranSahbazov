package tasks8;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        LinkedList<Integer> kesisme = kesisme(list1, list2);
        System.out.println("Kesisme: " + kesisme);

        LinkedList<Integer> birlesme = birlesme(list1, list2);
        System.out.println("Birlesme: " + birlesme);
    }

    public static LinkedList<Integer> kesisme(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        LinkedList<Integer> kesisme = new LinkedList<>();

        Set<Integer> set = new HashSet<>(list1);

        for (Integer element : list2) {
            if (set.contains(element)) {
                kesisme.add(element);
            }
        }

        return kesisme;
    }

    public static LinkedList<Integer> birlesme(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> birlesme = new LinkedList<>();

        birlesme.addAll(list1);

        for (Integer element : list2) {
            if (!birlesme.contains(element)) {
                birlesme.add(element);
            }
        }

        return birlesme;
    }
}
