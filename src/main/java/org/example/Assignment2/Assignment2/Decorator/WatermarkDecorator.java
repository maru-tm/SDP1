package org.example.Assignment2.Assignment2.Decorator;

import org.example.Assignment2.Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // Задача: Реализуйте логику, которая сначала отображает документ, а затем добавляет к нему водяной знак.
}

