package ImtahanaHazirliq;

public class Task2 {
    public static void main(String[] args) {
        String s = "2481632641282565121024";

        StringBuilder str = new StringBuilder();


        long a = 1;
        int b = 0;

        while (!s.equals(str.toString())) {
            b++;
            a = a * 2;
            str.append(a);
        }
        System.out.println("2nin sonuncu quvveti: " + b);

    }
}
