package tasks2.task4ve5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("bir eded daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 2; i < a; i++) {
            if (yoxlama(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean yoxlama(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

