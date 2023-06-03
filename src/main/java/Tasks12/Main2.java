package Tasks12;


interface FaktorialOperation{
    int calculate(int a);
}
public class Main2 {
    public static void main(String[] args) {
        FaktorialOperation factorial = (a)->{
            int result=1;
            for (int i = 1;i<=a;i++){
                result*=i;

            }
            return result;
        };
        int result = factorial.calculate(9);
        System.out.println(result);
    }
}
