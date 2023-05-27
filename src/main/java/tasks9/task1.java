package tasks9;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Map<String, List<String>> map1 = new HashMap<>();
        map1.put("key1",List.of("string1"));
        map1.put("key2",List.of("string 2"));
        map1.put("key3",List.of("string 3"));
        map1.put("key4",List.of("string 4"));

        Map<String, List<String>> map2 = new HashMap<>();
        map2.put("key3",List.of("string 5"));
        map2.put("key4",List.of("string 6"));
        map2.put("key5",List.of("string 7"));
        map2.put("key6",List.of("string 8"));

        Set<String> keys = map1.keySet();
        for (String key : keys) {
            if(ortaqKeyler(map2,key)){
                System.out.println(key);
            }
        }


    }
    public static boolean ortaqKeyler(Map<String,List<String>>map2,String key){

        Set<String> keys = map2.keySet();

        for (String keyvalue :keys ) {

            if(key.equals(keyvalue)){
                return true;
            }
        }return false;

    }
}
