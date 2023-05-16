package tasks4;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        String s = "en boyuk biclik duzlukdur qaqa.";

        String arr[] = s.trim().split(" ");

        String s2 = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > s2.length()) {
                s2 = arr[i];
            }
        }
        System.out.println(s2);
    }
}
