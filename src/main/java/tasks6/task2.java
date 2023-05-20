package tasks6;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        try {

            eded(8);
        } catch (Tekrarlanmaz e) {
            throw new RuntimeException(e);
        }
    }

    static void eded(int a)throws Tekrarlanmaz{
        int b=5;
        if(a!=b){
            throw new Tekrarlanmaz("eded deyisdirile bilmez");
        }
    }
}
