package tasks1.tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("sozu daxil edin: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        boolean b = true;

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {

            if (arr[i] != arr[j]) {
                b = false;
                break;
            }

        }
        if (b == false) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }


    }
}
