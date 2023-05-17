package tasks5;

public class romb {
    public static void main(String[] args) {
        int a = 10;
        int b=1;
        int c=a-1;
        String s = " ";


        for (int i = 0; i <a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(s);
            }c--;
            for (int j = 0; j < b; j++) {
                System.out.print(" *");
            }b++;
            System.out.println();
        }
        b=b-2;

        for (int i = 0; i < a; i++) {


            System.out.print(s);
            for (int j = 0; j <b; j++) {
                System.out.print(" *");
            }
            s=s+" ";
            b--;

            System.out.println();
        }
    }
}
