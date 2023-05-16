package tasks4;

public class task5 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 33, 3, 3, 3, 2, 4, 1, 4, 55, 6, 4, 3, 2, 2, 2, 55};
        int max = 0;
        int maxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (intCounter(arr, arr[i]) > max) {
                max++;
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);
    }

    private static int intCounter(int arr[], int element) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                a++;
            }
        }
        return a;
    }
}
