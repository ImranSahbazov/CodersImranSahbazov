package tasks4;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        String s = " isteyirdim sorusam perverdigardaaan, goresen dunyaya nos gelib insaan?";

        String array[] = s.replaceAll("[^a-zA-Z0-9\\s]", "").trim().split(" ");

        System.out.println(Arrays.toString(array));

        String s2 = "";
        for (int i = 0; i < array.length; i++) {
            s2 += " " + firsStringUpper(array[i]);
        }
        System.out.println(s2);


    }

    private static String firsStringUpper(String soz) {
        String s = String.valueOf(soz.charAt(0));
        String s1 = s.toUpperCase();
        System.out.println(s1);
        String s2 = s1;
        for (int i = 1; i < soz.length(); i++) {
            s2 += soz.charAt(i);
        }
        return s2;
    }

}
