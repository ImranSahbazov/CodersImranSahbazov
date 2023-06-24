package ImtahanaHazirliq3;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String engWord = sc.next();


        Map<String, List<String>> map = new HashMap<>();
        map.put("love", List.of("sevgi", "esq"));
        map.put("dailiy", List.of("gundelik"));
        map.put("Strong", List.of("guclu", "quvvetli"));
        map.put("week", List.of("zeif", "aciz"));


        String[] arr = map.keySet().toArray(new String[0]);
        for (String s : arr) {
            if (Objects.equals(s, engWord)) {
                System.out.println(map.get(s));
                return;
            }
        }

        System.out.println("daxil etdiyiniz soz lugetimizde movcud deil.");

    }
}
