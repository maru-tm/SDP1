package org.example.Assignment3.Command;

public class PreviousChannelCommand implements Command {
    private Television television;

    public PreviousChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.previousChannel();
    }
}