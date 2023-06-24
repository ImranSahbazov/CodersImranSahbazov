package ImtahanaHazirliq3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("necenci ayi istediyinizi qeyd edin.");
        int i = sc.nextInt();
        System.out.println("hansi dilde istediyinizi qeyd edin.");
        String s = sc.next().toUpperCase();


        MonthEnum SelectedMonth = MonthEnum.values()[i - 1];
        LangEnum SelectedLang = LangEnum.valueOf(s);



        String FinalLanguage = switch (SelectedLang) {
            case AZ -> SelectedMonth.getMonthNameAz();
            case TR -> SelectedMonth.getMonthNameTr();
            case ENG -> SelectedMonth.getMonthNameEng();
            case RU -> SelectedMonth.getMonthNameRus();
        };

        System.out.println(i);
        System.out.println(FinalLanguage);
        System.out.println(SelectedLang);

    }
}
