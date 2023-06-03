package Tasks12;

@FunctionalInterface
interface StringLengthOperation {
    int calculate(String str);
}

public class Main3 {
    public static void main(String[] args) {
        StringLengthOperation stringLength = (str) -> str.length();
        int result = stringLength.calculate("Isteyirdim sorusam perverdigardan, goresen dunyaya nos gelib insan");
        System.out.println("Stringin Uzunluğu: " + result);
    }
}
