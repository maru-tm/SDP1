package org.example.Assignment3.Command;


public class RemoteControl {
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChannelCommand;
    private Command previousChannelCommand;

    public void setTurnOnCommand(Command command) {
        this.turnOnCommand = command;
    }

    public void setTurnOffCommand(Command command) {
        this.turnOffCommand = command;
    }

    public void setVolumeUpCommand(Command command) {
        this.volumeUpCommand = command;
    }

    public void setVolumeDownCommand(Command command) {
        this.volumeDownCommand = command;
    }

    public void setNextChannelCommand(Command command) {
        this.nextChannelCommand = command;
    }

    public void setPreviousChannelCommand(Command command) {
        this.previousChannelCommand = command;
    }

    public void pressTurnOn() {
        if (turnOnCommand != null) {
            turnOnCommand.execute();
        }
    }

    public void pressTurnOff() {
        if (turnOffCommand != null) {
            turnOffCommand.execute();
        }
    }

    public void pressVolumeUp() {
        if (volumeUpCommand != null) {
            volumeUpCommand.execute();
        }
    }

    public void pressVolumeDown() {
        if (volumeDownCommand != null) {
            volumeDownCommand.execute();
        }
    }

    public void pressNextChannel() {
        if (nextChannelCommand != null) {
            nextChannelCommand.execute();
        }
    }

    public void pressPreviousChannel() {
        if (previousChannelCommand != null) {
            previousChannelCommand.execute();
        }
    }
}