package ImtahanaHazirliq;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("4 reqemli natural ededi daxil edin: ");
        int a = sc.nextInt();

        int b = a / 1000;
        a = a - b * 1000;
        int c = a / 100;
        a = a - c * 100;
        int d = a / 10;
        int e = a % 10;

        int cavab = e * 1000 + c * 100 + d * 10 + b;

        System.out.println(cavab);


    }

}
