package org.example.Assignment3.Iterator;

// Универсальный интерфейс для всех итераторов.
public interface Iterator<T> {
    boolean hasNext();
    T next();
}