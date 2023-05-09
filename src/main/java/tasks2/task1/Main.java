package tasks2.task1;

import java.math.MathContext;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        System.out.println(a);


        Scanner sc = new Scanner(System.in);
        System.out.println("bir eded daxil edin: ");
        int b = sc.nextInt();
        while (true) {
            if (b > a) {
                System.out.println("edediniz boyukdur, yeniden daxil edin");
                b=sc.nextInt();
            } else if (b < a) {
                System.out.println("edediniz kicikdir, yeniden daxil edin");
                b=sc.nextInt();
            } else {
                System.out.println("tebrikler!!!");
                break;
            }

        }

    }
}