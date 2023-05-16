package tasks4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task2 {
    public static void main(String[] args) {
        System.out.println(getSubscription(60));

    }
    public static LocalDateTime getSubscription(int amount){
        LocalDateTime localDateTime= LocalDateTime.now();
        if(amount==5){
             localDateTime= LocalDateTime.now().plusDays(7);
        }else if(amount==15){
             localDateTime= LocalDateTime.now().plusMonths(1);
        }else if(amount==25){
             localDateTime= LocalDateTime.now().plusMonths(2);
        }else if(amount==60){
            localDateTime= LocalDateTime.now().plusYears(1);
        }else{
            System.out.println("daxil etdiyiniz meblege uygun paketimiz yoxdur.");
        }
        String format = localDateTime.format(DateTimeFormatter.ofPattern("dd.MMM.YY 'saat ' hh:mm:ss"));
        return  localDateTime;
    }
}
