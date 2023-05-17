package tasks5;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("axtardiginiz ededi daxil edin: ");
        int a = sc.nextInt();
        String s = "";

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b = arr.length;
        while (b > 0) {
            for (int i = b; i > b / 2; i--) {
                if (a == arr[i - 1]) {
                    System.out.println("verilmis edilmis eded arrayin daxilindedir.");
                    s = "tapildi";
                    return;
                }
            }
            b = b / 2;
        }
        if (s != "tapildi") {
            System.out.println("verilmis edilmis eded arrayin daxilinde deil.");
        }
    }
}
