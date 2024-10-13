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
        // 1. Цепочка ответственности (Chain of Responsibility)
        // Создаем обработчики платежей A, B и C.
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Устанавливаем цепочку: A -> B -> C
        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        // Проверяем обработку платежа на сумму 210 долларов
        System.out.println("Покупка на сумму 210 долларов:");
        paymentA.handlePayment(210); // Вызываем обработку платежа

        // 2. Паттерн команды (Command Pattern)
        System.out.println("\n=== Паттерн команды для телевизора ===");
        Television tv = new Television(); // Создаем объект телевизора
        // Создаем команды для управления телевизором
        TurnOnCommand turnOn = new TurnOnCommand(tv);
        TurnOffCommand turnOff = new TurnOffCommand(tv);
        VolumeUpCommand volumeUp = new VolumeUpCommand(tv);
        VolumeDownCommand volumeDown = new VolumeDownCommand(tv);
        NextChannelCommand nextChannel = new NextChannelCommand(tv);
        PreviousChannelCommand previousChannel = new PreviousChannelCommand(tv);

        // Создаем пульт управления и добавляем команды
        RemoteControl remote = new RemoteControl();
        remote.addCommand("TurnOn", turnOn);
        remote.addCommand("TurnOff", turnOff);
        remote.addCommand("VolumeUp", volumeUp);
        remote.addCommand("VolumeDown", volumeDown);
        remote.addCommand("NextChannel", nextChannel);
        remote.addCommand("PreviousChannel", previousChannel);

        // Проверяем выполнение команд
        remote.pressButton("TurnOn");
        remote.pressButton("VolumeUp");
        remote.pressButton("NextChannel");
        remote.pressButton("TurnOff");
        remote.pressButton("NonExistentCommand"); // Пример несуществующей команды

        // 3. Итератор (Iterator Pattern)
        // Создаем коллекцию фильмов на основе списка
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Inception"); // Добавляем фильмы
        listCollection.addMovie("The Matrix");
        listCollection.addMovie("Interstellar");

        // Создаем коллекцию фильмов на основе массива
        String[] movieArray = {"Titanic", "Avatar", "The Godfather"};
        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(movieArray);

        // Выводим фильмы из списка с использованием итератора
        Iterator<String> listIterator = listCollection.createIterator();
        System.out.println("Фильмы из списка:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next()); // Проверяем наличие следующего фильма
        }

        // Выводим фильмы из массива с использованием итератора
        Iterator<String> arrayIterator = arrayCollection.createIterator();
        System.out.println("\nФильмы из массива:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next()); // Проверяем наличие следующего фильма
        }

        // 4. Посредник (Mediator Pattern)
        HomeMediatorImpl mediator = new HomeMediatorImpl(); // Создаем медиатор

        // Создаем сенсоры
        Sensor temperatureSensor = new TemperatureSensor();
        Sensor humiditySensor = new HumiditySensor();
        Sensor lightSensor = new LightSensor();

        // Устанавливаем медиатор для сенсоров
        temperatureSensor.setMediator(mediator);
        humiditySensor.setMediator(mediator);
        lightSensor.setMediator(mediator);

        // Обновляем данные сенсоров
        temperatureSensor.updateData();
        humiditySensor.updateData();
        lightSensor.updateData();

        // Выводим отчет по собранным данным
        mediator.reportData();

        // 5. Паттерн снимка (Memento Pattern)
        TextEditor editor = new TextEditor(); // Создаем текстовый редактор
        Caretaker caretaker = new Caretaker(); // Создаем хранителя для снимков

        // Добавляем текст в редактор
        editor.setText("Hello, World!");
        // Сохраняем текущее состояние
        caretaker.addMemento(editor.save());

        // Добавляем больше текста
        editor.setText("Hello, World! How are you?");
        System.out.println("Текущий текст: " + editor.getText());

        // Восстанавливаем предыдущее состояние
        editor.restore(caretaker.getMemento(0));
        System.out.println("Восстановленный текст: " + editor.getText());
    }
}
