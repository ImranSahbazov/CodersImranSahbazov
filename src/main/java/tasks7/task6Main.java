package tasks7;

import java.util.Arrays;

public class task6Main {

    public static Card[] arr = new Card[4];


    public static void main(String[] args) {
        arr[0] = new Card("1234567891234567", 999);
        arr[1] = new Card("9374893243279847", 888);
        arr[2] = new Card("9374111111432798", 777);
        arr[3] = new Card("1234567898765445", 666);

        try {
            transfer("1234567891234567", 79, "9374111111432798");
        } catch (ArraydedirmiException e) {
            e.printStackTrace();
            System.out.println("daxil etdiyiniz nomreye dair kart arrayimizde movcud deildir");

        } catch (KartNomMinSayException e) {
            e.printStackTrace();
            System.out.println("daxil etdiyiniz nomre sayi standartlarimiza uygun deildir");
        } catch (MinimalMeblegException e) {
            e.printStackTrace();
            System.out.println("en azi bir manat gondermelisiniz");
        } catch (NoMoneyException e) {
            e.printStackTrace();
            System.out.println("gondermek istediyiniz mebleg balansinizda movcud deil");

        }
        System.out.println(Arrays.toString(arr));


    }


    public static void transfer(String senderCardNum, double amount, String receiverCardNum) throws ArraydedirmiException, KartNomMinSayException, MinimalMeblegException, NoMoneyException {

        if (!isElementOfArray(senderCardNum)) {
            throw new ArraydedirmiException();
        }
        if (!isElementOfArray(receiverCardNum)) {
            throw new ArraydedirmiException();
        }
        if (senderCardNum.length() != 16) {
            throw new KartNomMinSayException();
        }
        if (receiverCardNum.length() != 16) {
            throw new KartNomMinSayException();
        }
        if (amount < 1) {
            throw new MinimalMeblegException();
        }
        if (returnElement(senderCardNum).balance < amount) {
            throw new NoMoneyException();
        } else {
            returnElement(senderCardNum).balance -= (amount + 1);
            returnElement(receiverCardNum).balance += amount;
            System.out.println("kocurulme ugurla tamamlandi");
        }


    }

    public static boolean isElementOfArray(String s) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (s == arr[i].cardNum) {
                b = true;
            }
        }
        return b;
    }

    public static Card returnElement(String s) {
        for (int i = 0; i < arr.length; i++) {
            if (s == arr[i].cardNum) {
                return arr[i];
            }
        }
        return null;
    }

}
