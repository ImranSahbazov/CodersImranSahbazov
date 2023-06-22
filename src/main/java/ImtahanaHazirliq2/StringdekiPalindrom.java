package ImtahanaHazirliq2;

public class StringdekiPalindrom {
    public static void main(String[] args) {
        String s = "salam dostlar necesiz ana ata haqqi mam odenmez.";
        String[] strArr = s.split(" ");
        for (String value : strArr) {
            if (isPalinrom(value)) {
                System.out.println(value);
            }
        }



    }

    public static boolean isPalinrom(String s) {
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - (i+1))) {

                return false;
            }
        }
        return true;
    }
}




