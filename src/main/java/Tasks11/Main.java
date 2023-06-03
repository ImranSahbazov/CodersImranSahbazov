package Tasks11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new PairParameters("alma", 40) ;

        System.out.println("key: "+pair.getkey());
        System.out.println("value: "+pair.getValue());
    }
}
