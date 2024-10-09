package org.example.Assignment3.Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private String data;

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void updateData() {
        // Пример получения данных температуры
        this.data = "22°C";
        mediator.setTemperatureData(data);
    }

    @Override
    public String getData() {
        return data;
    }
}