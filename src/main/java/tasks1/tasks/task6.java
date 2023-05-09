package tasks1.tasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Stringi daxil edin: ");
        String s = sc.nextLine();
        char[] arr = new char[s.length()];
        int a = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            a = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == arr[i]) {
                    a++;

                }
            }
            sb.append(arr[i] + "-" + a);

            System.out.println(arr[i] + "-" + a);
        }


    }


}

