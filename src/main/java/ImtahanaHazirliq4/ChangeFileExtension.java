package ImtahanaHazirliq4;

import java.io.File;

public class ChangeFileExtension {
    public static void main(String[] args) {
        File file = new File("C:\\Workspace\\intelijUltimate\\CodersImranSahbazov\\src\\main\\java\\ImtahanaHazirliq4\\img.txt");
        String yeniYol = "C:\\Workspace\\intelijUltimate\\CodersImranSahbazov\\src\\main\\java\\ImtahanaHazirliq4\\img.png";

        File yeniDosya = new File(yeniYol);
        boolean succes = file.renameTo(yeniDosya);

        if (succes) {
            System.out.println("Filenin uzantisi deyisdirildi.");
        } else {
            System.out.println("Filenin uzantisi deyisdirile bilmedi.");
        }
    }
}