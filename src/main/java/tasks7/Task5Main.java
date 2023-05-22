package tasks7;

import java.util.Scanner;

public class Task5Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("pathi daxil edin: ");
        String path = sc.nextLine();

        task5 f = pathToFolder(path, 0);


        System.out.println(f.toString());
    }


    static task5 pathToFolder(String path, int i) {

        String[] arr = path.split("/");

        if (i >= arr.length) {
            return null;
        }

        return new task5(arr[i], pathToFolder(path, i + 1));
    }
}
