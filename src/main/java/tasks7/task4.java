package tasks7;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {


        System.out.println("stringi daxil edin: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(tersStringRekursiya(s));
    }


    static String tersStringRekursiya(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return  tersStringRekursiya(s.substring(1)) + s.charAt(0);
    }
}
