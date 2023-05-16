package tasks4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dogum tarixinizi daxil edin (YYYY-MM-DD)  : ");
        String dogumTarixi = sc.nextLine();


        LocalDate dogum = LocalDate.parse(dogumTarixi);

        LocalDate bugun = LocalDate.now();

        Period period = Period.between(dogum, bugun);

        System.out.println(period.getYears());
    }

}
