package org.example.Assignment3.Memento;

import java.util.ArrayList;
import java.util.List;

// Хранитель, управляющий сохранением и восстановлением состояния.
public class Caretaker {
    private List<TextMemento> savedStates = new ArrayList<>();

    // Метод для добавления снимка состояния в список.
    public void addMemento(TextMemento memento) {
        savedStates.add(memento);
    }

    // Метод для получения снимка по индексу.
    public TextMemento getMemento(int index) {
        if (index >= 0 && index < savedStates.size()) {
            return savedStates.get(index);
        }
        return null; // Or throw an exception for better error handling
    }
}