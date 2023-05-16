package tasks4;

public class task6 {
    public static void main(String[] args) {
        int a=123;
        int b=0;
        StringBuilder s= new StringBuilder();
        while(a>0){
            b=a%2;
            a=a/2;
            StringBuilder sb =s.append(b);
        }
        System.out.println(s.reverse());
    }
}
