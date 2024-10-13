package org.example.Assignment3.Memento;

// Снимок (Memento), хранящий состояние текста редактора.
public class TextMemento {
    private final String text;

    // Конструктор, принимающий текст для создания снимка.
    public TextMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}