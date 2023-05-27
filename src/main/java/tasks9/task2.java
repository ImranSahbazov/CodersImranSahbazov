package tasks9;
import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        String str = "hkjasfaaaadhhasfsfaff";
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                int count = charFrequency.getOrDefault(c, 0);
                charFrequency.put(c, count + 1);
            }
        }

        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFrequency) {
                mostFrequentChar = key;
                maxFrequency = value;
            }
        }

        System.out.println("en cox istifade olunan herf = " + mostFrequentChar);
    }
}