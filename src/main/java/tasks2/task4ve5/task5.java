package tasks2.task4ve5;

public class task5 {
    public static void main(String[] args) {
        int arr[] = {12, 4, 5, 6, 17, 7, 3, 38};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max deyer: " + max);
        System.out.println("min deyer: " + min);
    }

}
