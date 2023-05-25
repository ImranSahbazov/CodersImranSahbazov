package tasks8;

import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        countElement(list);
    }

    public static void countElement(List<Integer> list) {
        List<Integer> counterList = new ArrayList<>();
        List<Integer> elementList = new ArrayList<>();

        for (Integer element : list) {
            if (elementList.contains(element)) {
                int index = elementList.indexOf(element);
                int sayac = counterList.get(index);
                counterList.set(index, sayac + 1);
            } else {
                elementList.add(element);
                counterList.add(1);
            }
        }

        System.out.println("Elementlerin Sayi: ");
        for (int i = 0; i < elementList.size(); i++) {
            int element = elementList.get(i);
            int count = counterList.get(i);
            System.out.println(element + ": " + count);
        }
    }
}
