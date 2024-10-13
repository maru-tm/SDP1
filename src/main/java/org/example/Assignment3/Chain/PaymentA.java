package org.example.Assignment3.Chain;

// Реализация способа оплаты A
public class PaymentA extends PaymentHandler {
    private int balance = 100;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("Оплата произведена с помощью PaymentA.");
        } else if (nextHandler != null) {
            System.out.println("Недостаточно средств в PaymentA. Передача запроса дальше...");
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Оплата не может быть обработана. Недостаточно средств.");
        }
    }
}
