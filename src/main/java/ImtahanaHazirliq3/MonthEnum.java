package ImtahanaHazirliq3;

import java.util.List;

public enum MonthEnum {
    JANUARY(1, "Yanvar", "January", "Январь", "Ocak"),
    FEBRUARY(2, "Fevral", "February", "Февраль", "Şubat"),
    MARCH(3, "Mart", "March", "Март", "Mart"),
    APRIL(4, "Aprel", "April", "Апрель", "Nisan"),
    MAY(5, "May", "May", "Май", "Mayıs"),
    JUNE(6, "İyun", "June", "Июнь", "Haziran"),
    JULY(7, "İyul", "July", "Июль", "Temmuz"),
    AUGUST(8, "Avqust", "August", "Август", "Ağustos"),
    SEPTEMBER(9, "Sentyabr", "September", "Сентябрь", "Eylül"),
    OCTOBER(10, "Oktyabr", "October", "Октябрь", "Ekim"),
    NOVEMBER(11, "Noyabr", "November", "Ноябрь", "Kasım"),
    DECEMBER(12, "Dekabr", "December", "Декабрь", "Aralık");

    private final int MonthNumber;
    private final String MonthNameAz;
    private final String MonthNameEng;
    private final String MonthNameRus;
    private final String MonthNameTr;

    public int getMonthNumber() {
        return MonthNumber;
    }

    public String getMonthNameAz() {
        return MonthNameAz;
    }

    public String getMonthNameEng() {
        return MonthNameEng;
    }

    public String getMonthNameRus() {
        return MonthNameRus;
    }

    public String getMonthNameTr() {
        return MonthNameTr;
    }

    MonthEnum(int monthNumber, String monthNameAz, String monthNameEng, String monthNameRus, String monthNameTr) {
        MonthNumber = monthNumber;
        MonthNameAz = monthNameAz;
        MonthNameEng = monthNameEng;
        MonthNameRus = monthNameRus;
        MonthNameTr = monthNameTr;
    }
}
