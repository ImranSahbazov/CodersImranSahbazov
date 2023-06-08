package Tasks15;

import Tasks15.User;

import java.time.LocalDate;

class Card {
    private User user;
    private String cardNumber;
    private LocalDate expiredDate;
    private double balance;

    public Card(User user, String cardNumber, LocalDate expiredDate, double balance) {
        this.user = user;
        this.cardNumber = cardNumber;
        this.expiredDate = expiredDate;
        this.balance = balance;
    }

    // Getters and setters
    public User getUser() {
        return user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isValid() {
        return cardNumber.length() == 16 && expiredDate.isAfter(LocalDate.now());
    }

    public void transferMoney(Card receiver, double amount) {
        if (isValid() && balance >= amount) {
            balance -= amount;
            receiver.depositMoney(amount);
            System.out.println("kocurme ugurla basa catdi");
        } else {
            System.out.println("kocurme aparila bilmedi. yanlis kart ve ya yetersiz balans.");
        }
    }

    public void depositMoney(double amount) {
        balance += amount;
    }
}

