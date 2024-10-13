package org.example.Assignment3.Memento;

// Редактор текста, который создает и восстанавливает снимки.
public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Создаем снимок состояния с текущим текстом.
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Восстанавливаем состояние текста из переданного снимка.
    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }
}