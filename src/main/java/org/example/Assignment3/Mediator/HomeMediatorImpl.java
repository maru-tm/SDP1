package org.example.Assignment3.Mediator;


import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors = new ArrayList<>();
    private String temperatureData;
    private String humidityData;
    private String lightData;

    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public void reportData() {
        System.out.println("Отчет о данных сенсоров:");
        System.out.println("Температура: " + temperatureData);
        System.out.println("Влажность: " + humidityData);
        System.out.println("Освещенность: " + lightData);
    }

    public void setTemperatureData(String data) {
        this.temperatureData = data;
    }

    public void setHumidityData(String data) {
        this.humidityData = data;
    }

    public void setLightData(String data) {
        this.lightData = data;
    }
}