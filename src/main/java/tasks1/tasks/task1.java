package tasks1.tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("arrayin olcusunu teyin edin: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int arr[] = new int[a];
        System.out.println("arrayin ededlerini daxil edin: ");

        for (int i = 0; i < arr.length; i++) {


            arr[i] = sc.nextInt();
        }
        boolean b = true;
        for (int i = 2; i < arr.length; i++) {

            if (arr[i] != arr[i - 2] + arr[i - 1]) {
                b = false;
            }
        }

        if (b == false) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
