package ImtahanaHazirliq2;

import java.util.Arrays;

public class Rekursiya {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(arr));

        reverseIntArr(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

    public static void reverseIntArr(int[] arr, int left, int right) {
        if (left < right) {
            int a = arr[left];
            int b = arr[right];
            arr[right] = a;
            arr[left] = b;
            reverseIntArr(arr, left + 1, right - 1);
        }

    }
}
