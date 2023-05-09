package tasks1.tasks;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        System.out.println("massivin olcusunu teyin edin: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[][] arr = new int[a][a];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {

                if (i + j < a) {
                    arr[i][j] = 0;

                } else {
                    arr[i][j] = 1;

                }
            }

        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
