package ImtahanaHazirliq;

import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 5, 7, 2, 4, 6, 8,1,4,56,7,8,9,11,12,33,2,2,2,2,4};

        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (learnSize(numbers, i) > max) {
                max = learnSize(numbers, i);
            }

        }
        for (int j = 0; j < numbers.length; j++) {
            if ((learnSize(numbers, j) == max)) {
                for (int i = 0; i <= max; i++) {
                    System.out.print(numbers[j++]+",  ");
                }
            }

        }
    }

    public static int learnSize(int[] arr, int i) {
        int b = 0;

        for (int j = i; j < arr.length - 1; j++) {
            if (arr[i] < arr[i + 1]) {
                b++;
            } else return b;
            i++;

        }
        return b;
    }
}

