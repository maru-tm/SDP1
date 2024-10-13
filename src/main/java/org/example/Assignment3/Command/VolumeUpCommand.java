package org.example.Assignment3.Command;

// Команда для увеличения громкости.
public class VolumeUpCommand implements Command {
    private Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeUp();
    }
}