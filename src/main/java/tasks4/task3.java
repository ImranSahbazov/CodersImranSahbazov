package tasks4;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {


        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {5, 6, 7, 8, 9, 10};
        int a = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (eyniElementler(arr1, arr2[i])) {
                a++;

            }
        }
        int b = 0;
        int arr3[] = new int[a];
        for (int i = 0; i < arr1.length; i++) {
            if (eyniElementler(arr1, arr2[i])) {
                arr3[b++] = arr2[i];
            }
        }
        int c = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            if (!eyniElementler(arr1, arr2[i])) {
                c++;
            }
        }
        int[] arr4 = new int[c];
        for (int i = 0; i < arr1.length; i++) {
            arr4[i] = arr1[i];
        }
        int d = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            if (!eyniElementler(arr1, arr2[i])) {
                arr4[d++] = arr2[i];
            }
        }


        System.out.println("arraylarin kesismesi = "+ Arrays.toString( arr3));
        System.out.println("arraylarin birlesmesi = "+ Arrays.toString(arr4));
    }

    private static boolean eyniElementler(int[] arr, int element) {
        for (int element2 : arr) {
            if (element2 == element) {
                return true;
            }
        }
        return false;
    }
}