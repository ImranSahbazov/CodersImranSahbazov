package tasks7;

public class task3 {
    public static void main(String[] args) {
        int[]arr={2,52,6,260,3,2,6,77,100};

        System.out.println(MaxEded(arr,0,0));
    }



  static   int MaxEded(int[] arr,int i,int max){

        if(arr[i]>max){
            max=arr[i];
        }

        if(i>=arr.length-1){
            return max;
        }
        return MaxEded(arr,i+1,max);
    }
}
