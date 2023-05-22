package tasks7;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.println(faktorial(new Scanner(System.in).nextInt()));
    }

   static int faktorial(int a){
        if(a==1 ){
            return 1;
        }

        return a*faktorial(a-1);
        //5*(4(3(2(
    }
}
