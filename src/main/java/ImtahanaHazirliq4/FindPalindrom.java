package ImtahanaHazirliq4;

import java.util.Arrays;
import java.util.List;

public class FindPalindrom {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "kayak", "level", "hello", "world", "civic", "racecar");

        List<String> palindromes = words.stream().filter(FindPalindrom::isPalindrome).toList();

        System.out.println("Palindromes: " + palindromes);
    }

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}

