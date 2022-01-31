package com.cdejong.patterns.command.commands;

import com.cdejong.patterns.command.Command;
import com.cdejong.patterns.command.Television;

public class VolumeDownCommand implements Command {
    private final Television television;

    public VolumeDownCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        // check if television is on
        if (!television.isPowered()) {
            System.out.println("COMMAND ERROR: television is off");
            return;
        }

        // check if min volume is reached
        if (television.getVolume() == Television.MIN_VOLUME) {
            System.out.println("COMMAND ERROR: min volume reached!"); // send warning
        } else {
            television.volumeDown(); // update the volume
        }

        // print new volume
        System.out.println("volume: " + television.getVolume());
    }
}
