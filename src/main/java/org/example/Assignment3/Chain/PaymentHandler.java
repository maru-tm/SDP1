package org.example.Assignment3.Chain;

// Абстрактный класс, определяющий структуру цепочки
public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    // Метод для установки следующего обработчика в цепочке
    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Абстрактный метод, который реализуют наследники
    public abstract void handlePayment(int amount);
}
