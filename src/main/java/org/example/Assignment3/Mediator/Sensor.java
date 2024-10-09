package org.example.Assignment3.Mediator;

public interface Sensor {
    void setMediator(HomeMediator mediator);
    void updateData();
    String getData();
}