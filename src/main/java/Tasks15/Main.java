package Tasks15;

import Tasks15.User;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Imran", "Shahbazov");
        User user2 = new User("Ilkin", "Namazov");

        Card card1 = new Card(user1, "1234567890123456", LocalDate.of(2025, 12, 31), 400.0);
        Card card2 = new Card(user2, "9876543210987654", LocalDate.of(2024, 6, 30), 400.0);

        transferMoney(card1, card2, 500.0);
    }

    public static void transferMoney(Card sender, Card receiver, double amount) {
        Optional.ofNullable(sender.getUser())
                .filter(user -> sender.isValid())
                .filter(user -> sender.getBalance() >= amount)
                .ifPresent(user -> sender.transferMoney(receiver, amount));
    }
}
