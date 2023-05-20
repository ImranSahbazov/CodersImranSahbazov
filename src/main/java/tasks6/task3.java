package tasks6;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 3, 7,22,43,44};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = yoxlayici(arr, i);

        }
        System.out.println(Arrays.toString(arr));

    }

    public static int yoxlayici(int arr[], int say) {
        int min = arr[say];
        int c;
        for (int i = say; i < arr.length; i++) {
            if (arr[i] < min) {
                c = min;
                min = arr[i];
                arr[i] = c;
            }
        }
        return min;
    }
}