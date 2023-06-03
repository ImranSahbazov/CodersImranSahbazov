package Tasks11;

public class Main2 {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 10, 5, 8, 20, 15 };
        Integer maxInteger = findMax(intArray);
        System.out.println("Max Integer: " + maxInteger);


        String[] stringArray = { "bmw", "nissan", "rolls-royce", "ferrari" };
        String maxString = findMax(stringArray);
        System.out.println("Max String: " + maxString);
    }
}
