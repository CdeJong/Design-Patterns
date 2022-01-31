package com.cdejong.patterns.command.commands;

import com.cdejong.patterns.command.Command;
import com.cdejong.patterns.command.Television;

public class PowerCommand implements Command {

    private final Television television;

    public PowerCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        // the television on if the television is off and turn it off if it is on.
        if (television.isPowered()) {
            television.turnOff();
        } else {
            television.turnOn();
        }

        // print the power state
        System.out.println("tv: " + (television.isPowered() ? "ON" : "OFF")); // inline if statement (condition ? if true : if false)
    }
}
