package tasks7;

public class task2 {
    public static void main(String[] args) {
        int [] arr={3,5,2,5,6,3,4};
        System.out.println(arrayCem(arr,0));
    }



    static int arrayCem(int arr[], int i){


        if(i>arr.length-1){
            return 0;
        }

        return arr[i]+arrayCem(arr,i+1);
    }
}
