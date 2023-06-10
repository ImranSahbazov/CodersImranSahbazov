package Tasks16;

import java.util.Optional;

public class Task4Main {
    public static void main(String[] args) {
        MusteriIdareSistemi idareSistemi = new MusteriIdareSistemi();

        Musteri musteri1 = new Musteri("Imran", "Shahbazov", "ishahbazov446@gmail.com", "4884848484");
        Musteri musteri2 = new Musteri("Ilkin", "Qeniyev", "ilkinsahbazov313@gmail.com", "1221212122");


        idareSistemi.musteriElave(musteri1);
        idareSistemi.musteriElave(musteri2);
        for (Musteri musteri : idareSistemi.musteriler()) {
            System.out.println("Müsteri: " + musteri.getAd() + " " + musteri.getSoyad());
        }


        idareSistemi.musteriSil(musteri1);
        for (Musteri musteri : idareSistemi.musteriler()) {
            System.out.println("Müsteri: " + musteri.getAd() + " " + musteri.getSoyad());
        }


        String axtarilanEmail = "ilkinsahbazove313@gmail.com";
        Optional<Musteri> tapilanMusteri = idareSistemi.musteriTap(axtarilanEmail);

        if (tapilanMusteri.isPresent()) {
            Musteri musteri = tapilanMusteri.get();
            System.out.println("Müşteri Tapildi: " + musteri.getAd() + " " + musteri.getSoyad());
        } else {
            System.out.println("Müşteri Tapilmadi");
        }
    }
}
