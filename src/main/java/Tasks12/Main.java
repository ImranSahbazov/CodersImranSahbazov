package Tasks12;

@FunctionalInterface
interface MathOperation {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        int result = addition.calculate(10, 15);
        System.out.println("Cem: " + result);
    }
}
