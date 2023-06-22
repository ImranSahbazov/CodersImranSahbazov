package ImtahanaHazirliq2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramSozler {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "o gun de imran yol gedirdi ramin onu gordu bu zaman qildilar namaz";

        String[] strArr = s.split(" ");

        for (String word1 : strArr) {
            for (String word2 : strArr) {
                if (!word1.equals(word2)) {
                    if (isAnagram(word1, word2)) {
                        list.add(word1);
                    }
                }
            }
        }
        System.out.println(list.toString());
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] str1 = s1.toLowerCase().toCharArray();
        char[] str2 = s2.toLowerCase().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}
