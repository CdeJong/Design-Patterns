package com.cdejong.patterns.command.commands;

import com.cdejong.patterns.command.Command;
import com.cdejong.patterns.command.Television;

public class VolumeUpCommand implements Command {

    private final Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        // check if television is on
        if (!television.isPowered()) {
            System.out.println("COMMAND ERROR: television is off");
            return;
        }

        // check if max volume is reached
        if (television.getVolume() == Television.MAX_VOLUME) {
            System.out.println("COMMAND ERROR: max volume reached!"); // send warning
        } else {
            television.volumeUp(); // update the volume
        }

        // print new volume
        System.out.println("volume: " + television.getVolume());
    }
}
