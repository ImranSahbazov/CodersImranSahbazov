package tasks7;

public class Card {
    String cardNum;
    double balance;

    public Card() {

    }

    public Card(String cardNum, double balance) {
        this.cardNum = cardNum;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum='" + cardNum + '\'' +
                ", balance=" + balance +
                '}';
    }
}
