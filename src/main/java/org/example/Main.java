package org.example;

import org.example.Assignment3.Chain.PaymentA;
import org.example.Assignment3.Chain.PaymentB;
import org.example.Assignment3.Chain.PaymentC;
import org.example.Assignment3.Chain.PaymentHandler;

import org.example.Assignment3.Command.*;

import org.example.Assignment3.Iterator.Iterator;
import org.example.Assignment3.Iterator.ListMovieCollection;
import org.example.Assignment3.Iterator.ArrayMovieCollection;

import org.example.Assignment3.Mediator.*;

import org.example.Assignment3.Memento.TextEditor;
import org.example.Assignment3.Memento.Caretaker;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем различные способы оплаты с балансами
        PaymentHandler paymentA = new PaymentA(100);
        PaymentHandler paymentB = new PaymentB(300);
        PaymentHandler paymentC = new PaymentC(1000);

        // Устанавливаем цепочку обязанностей: A -> B -> C
        paymentA.setNext(paymentB).setNext(paymentC);

        // Попытка покупки на сумму 210 долларов
        double amountToPay = 210;
        System.out.println("Покупка на сумму " + amountToPay + " долларов.");
        paymentA.handlePayment(amountToPay);

        // 2. Command Pattern
        Television television = new Television();

        // Создаем команды
        Command turnOn = new TurnOnCommand(television);
        Command turnOff = new TurnOffCommand(television);
        Command volumeUp = new VolumeUpCommand(television);
        Command volumeDown = new VolumeDownCommand(television);
        Command nextChannel = new NextChannelCommand(television);
        Command previousChannel = new PreviousChannelCommand(television);

        // Создаем пульт
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setTurnOnCommand(turnOn);
        remoteControl.setTurnOffCommand(turnOff);
        remoteControl.setVolumeUpCommand(volumeUp);
        remoteControl.setVolumeDownCommand(volumeDown);
        remoteControl.setNextChannelCommand(nextChannel);
        remoteControl.setPreviousChannelCommand(previousChannel);

        // Тестируем команды
        remoteControl.pressTurnOn();         // Включаем телевизор
        remoteControl.pressVolumeUp();       // Увеличиваем громкость
        remoteControl.pressNextChannel();    // Переключаем на следующий канал
        remoteControl.pressVolumeDown();     // Уменьшаем громкость
        remoteControl.pressTurnOff();        // Выключаем телевизор

        // 3. Iterator Pattern
        // Создаем коллекцию фильмов на основе списка List
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Inception");
        listCollection.addMovie("The Matrix");
        listCollection.addMovie("Interstellar");

        // Создаем коллекцию фильмов на основе массива Array
        String[] movieArray = {"Titanic", "Avatar", "The Godfather"};
        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(movieArray);

        // Вывод фильмов из списка
        Iterator<String> listIterator = listCollection.createIterator();
        System.out.println("Фильмы из списка:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Вывод фильмов из массива
        Iterator<String> arrayIterator = arrayCollection.createIterator();
        System.out.println("\nФильмы из массива:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        // 4. Mediator Pattern
        HomeMediatorImpl mediator = new HomeMediatorImpl();

        Sensor temperatureSensor = new TemperatureSensor();
        Sensor humiditySensor = new HumiditySensor();
        Sensor lightSensor = new LightSensor();

        temperatureSensor.setMediator(mediator);
        humiditySensor.setMediator(mediator);
        lightSensor.setMediator(mediator);

        // Обновляем данные сенсоров
        temperatureSensor.updateData();
        humiditySensor.updateData();
        lightSensor.updateData();

        // Выводим отчет по собранным данным
        mediator.reportData();

        // 5. Memento Pattern
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Add text to the editor
        editor.setText("Hello, World!");
        // Save the current state
        caretaker.addMemento(editor.save());

        // Add more text
        editor.setText("Hello, World! How are you?");
        System.out.println("Current Text: " + editor.getText());

        // Restore the previous state
        editor.restore(caretaker.getMemento(0));
        System.out.println("Restored Text: " + editor.getText());
    }
}
