package tasks9;
import java.util.LinkedHashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        int number = 138;
        Map<Integer, String> romanNumerals = createRomanNumeralsMap();

        String romanNumeral = convertToRoman(number, romanNumerals);
        System.out.println("roma reremi ile:  " + romanNumeral);
    }

    public static Map<Integer, String> createRomanNumeralsMap() {
        Map<Integer, String> romanNumerals = new LinkedHashMap<>();
        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM");
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");
        return romanNumerals;
    }

    public static String convertToRoman(int number, Map<Integer, String> romanNumerals) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet()) {
            int value = entry.getKey();
            String romanNumeral = entry.getValue();

            while (number >= value) {
                result.append(romanNumeral);
                number -= value;
            }
        }

        return result.toString();
    }
}
