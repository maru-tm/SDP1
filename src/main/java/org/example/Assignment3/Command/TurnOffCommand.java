package org.example.Assignment3.Command;

// Команда для выключения телевизора.
public class TurnOffCommand implements Command {
    private Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}