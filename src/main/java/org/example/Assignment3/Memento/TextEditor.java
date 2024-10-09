package org.example.Assignment3.Memento;


public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Creates a memento with the current text state
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Restores the text state from a memento
    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }
}