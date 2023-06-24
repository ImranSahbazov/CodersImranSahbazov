package ImtahanaHazirliq3;


public enum LangEnum {
    AZ("Azerbaijani"),
    ENG("English"),
    RU("Russian"),
    TR("Turkish"), ;

    private final String Language;


    LangEnum(String Language) {
        this.Language=Language;
    }

    public String getLanguage() {
        return Language;
    }

}
