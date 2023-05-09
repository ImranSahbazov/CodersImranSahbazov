package tasks1.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 9};
        int[] arr2 = new int[arr.length + 1];

        System.out.println("ededi daxil edin:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        OUTER:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == a) {
                    arr2 = arr;
                    break OUTER;
                }

            }

            if (a < arr[0]) {
                arr2[0] = a;
                arr2[i + 1] = arr[i];

            } else {
                if (arr[i] < a) {
                    arr2[i] = arr[i];
                    arr2[arr2.length - 1] = a;
                } else if ((arr[i - 1] < a && a < arr[i])) {
                    arr2[i] = a;
                    arr2[i + 1] = arr[i];
                } else {
                    arr2[i + 1] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
