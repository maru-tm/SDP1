package org.example.Assignment3.Mediator;

// Интерфейс для сенсоров.
public interface Sensor {
    void setMediator(HomeMediator mediator);
    void updateData();
    String getData();
}