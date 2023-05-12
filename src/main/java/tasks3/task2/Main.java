package tasks3.task2;

import static tasks3.task2.MathOperations.*;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=3;

        double sum=add(a,b);
        double difference=subtract(a,b);
        double multiply=multiply(a,b);
        double dvide = dvide(a,b);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(multiply);
        System.out.println(dvide);
    }
}
