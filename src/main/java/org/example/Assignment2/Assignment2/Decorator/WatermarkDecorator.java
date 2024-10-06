package org.example.Assignment2.Assignment2.Decorator;

import org.example.Assignment2.Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    @Override
    public void display() {
        // Отображаем оригинальный документ
        decoratedDocument.display();
        // Добавляем водяной знак
        addWatermark();
    }

    // Метод добавления водяного знака
    private void addWatermark() {
        System.out.println("Водяной знак добавлен к документу.");
    }
}
