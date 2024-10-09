package org.example.Assignment3.Mediator;

public interface HomeMediator {
    void registerSensor(Sensor sensor);
    void reportData();

    void setHumidityData(String data);

    void setLightData(String data);

    void setTemperatureData(String data);
}