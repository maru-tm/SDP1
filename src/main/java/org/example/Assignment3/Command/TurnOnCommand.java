package org.example.Assignment3.Command;

// Команда для включения телевизора.
public class TurnOnCommand implements Command {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}