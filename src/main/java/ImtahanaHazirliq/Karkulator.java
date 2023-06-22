package ImtahanaHazirliq;

import java.util.Scanner;

public class Karkulator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("ilk ededi daxil edin: ");
        double a = sc.nextDouble();
        System.out.println("ikinci ededi daxil edin: ");
        double b = sc.nextDouble();
        System.out.println("edeceyiniz emelliyyati daxil edin...");
        String s = sc.next();


        switch (s) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            default -> System.out.println("yalnis emeliyyat");
        }
    }
}
