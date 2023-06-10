package Tasks16;

public class Musteri {
    private String ad;
    private String soyad;
    private String eposta;
    private String telefon;

    public Musteri(String ad, String soyad, String eposta, String telefon) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", eposta='" + eposta + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}

