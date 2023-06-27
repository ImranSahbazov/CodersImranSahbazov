package ImtahanaHazirliq4;


public class ArrayMax  {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,3,4,54,32,2,1};
        String [] arrStr={"sdfadfa","asdfadsfa","asdfasdfasdfimi","dfasdfafa"};

        System.out.println(maxElement(arrStr));

    }

    public static <T extends Comparable<T>>T maxElement(T[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }

        T max=arr[0];

        for (T t : arr) {
            if (t.compareTo(max) > 0) {
                max = t;
            }

        }
        return max;
    }
}
