package tasks4;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {

        int a = 99;
        int b = 36;
        int arr1[] = ededinBolenleri(18);
        int arr2[] = ededinBolenleri(27);
        int max = 0;
        int realMax = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    max = arr1[i];
                    if (max > realMax) {
                        realMax = max;
                    }
                }
            }
        }
        System.out.println(realMax);
    }

    private static int[] ededinBolenleri(int a) {
        int[] arr = new int[25];
        int b = 0;
        for (int i = 1; i < a / 2 + 1; i++) {
            if (a % i == 0) {
                arr[b] += i;
                b++;
            }
        }
        return arr;
    }
}
