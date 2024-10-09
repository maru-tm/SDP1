package org.example.Assignment3.Chain;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;
    protected double balance;

    // Устанавливаем следующий обработчик
    public PaymentHandler setNext(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    // Проверяем, может ли текущий способ оплаты покрыть сумму
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println(this.getClass().getSimpleName() + " оплатил " + amount + " долларов.");
        } else if (nextHandler != null) {
            System.out.println(this.getClass().getSimpleName() + " не смог оплатить. Передаем запрос дальше.");
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Недостаточно средств на всех счетах для оплаты.");
        }
    }
}
