package org.example.Assignment3.Chain;

// Реализация способа оплаты B
public class PaymentB extends PaymentHandler {
    private int balance = 300;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("Оплата произведена с помощью PaymentB.");
        } else if (nextHandler != null) {
            System.out.println("Недостаточно средств в PaymentB. Передача запроса дальше...");
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Оплата не может быть обработана. Недостаточно средств.");
        }
    }
}
