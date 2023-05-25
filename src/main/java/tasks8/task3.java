package tasks8;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> joinedAndSortedList = joinAndSort(list1, list2);
        System.out.println("joined and sorted list: " + joinedAndSortedList);
    }

    public static ArrayList<Integer> joinAndSort(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> joinedList = new ArrayList<>();

        joinedList.addAll(list1);

        joinedList.addAll(list2);

        int n = joinedList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (joinedList.get(j) > joinedList.get(j + 1)) {
                    int temp = joinedList.get(j);
                    joinedList.set(j, joinedList.get(j + 1));
                    joinedList.set(j + 1, temp);
                }
            }
        }

        return joinedList;
    }
}




