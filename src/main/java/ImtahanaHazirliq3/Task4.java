package ImtahanaHazirliq3;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        List<Map.Entry<Integer, Character>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort(Comparator.comparing(Map.Entry::getKey));
        for (Map.Entry<Integer, Character> entry : entryList) {
            System.out.print(entry.getValue());
        }


    }
}
