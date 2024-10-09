package org.example.Assignment3.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<TextMemento> savedStates = new ArrayList<>();

    // Save a memento
    public void addMemento(TextMemento memento) {
        savedStates.add(memento);
    }

    // Get a memento by index
    public TextMemento getMemento(int index) {
        if (index >= 0 && index < savedStates.size()) {
            return savedStates.get(index);
        }
        return null; // Or throw an exception for better error handling
    }
}