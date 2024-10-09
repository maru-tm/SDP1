package org.example.Assignment3.Command;

public class Television {
    public void turnOn() {
        System.out.println("Телевизор включён.");
    }

    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    public void volumeUp() {
        System.out.println("Уровень громкости увеличен.");
    }

    public void volumeDown() {
        System.out.println("Уровень громкости уменьшен.");
    }

    public void nextChannel() {
        System.out.println("Переключен на следующий канал.");
    }

    public void previousChannel() {
        System.out.println("Переключен на предыдущий канал.");
    }
}