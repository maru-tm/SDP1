package org.example.Assignment3.Chain;

// Реализация способа оплаты C
public class PaymentC extends PaymentHandler {
    private int balance = 1000;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("Оплата произведена с помощью PaymentC.");
        } else if (nextHandler != null) {
            System.out.println("Недостаточно средств в PaymentC. Передача запроса дальше...");
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Оплата не может быть обработана. Недостаточно средств.");
        }
    }
}
