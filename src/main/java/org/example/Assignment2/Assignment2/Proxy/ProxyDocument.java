package org.example.Assignment2.Assignment2.Proxy;

import org.example.Assignment2.Assignment2.Document;
import org.example.Assignment2.Assignment2.RealDocument;

// Proxy для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    // Задача: Вам нужно реализовать логику для создания документа только при первом обращении к методу display().
    // Если документ уже был загружен, он не должен загружаться заново.
    @Override
    public void display() {
        // Проверяем, был ли уже загружен настоящий документ
        if (realDocument == null) {
            // Если документ ещё не загружен, создаём его
            System.out.println("Создание настоящего документа: " + title);
            realDocument = new RealDocument(title);
        }
        // Отображаем документ
        realDocument.display();
    }
}

