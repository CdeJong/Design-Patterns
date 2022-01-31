package com.cdejong.patterns.command.commands;

import com.cdejong.patterns.command.Command;
import com.cdejong.patterns.command.Television;

public class ChannelDownCommand implements Command {
    private final Television television;

    public ChannelDownCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        // check if television is on
        if (!television.isPowered()) {
            System.out.println("COMMAND ERROR: television is off");
            return;
        }

        // check if minimum channel is reached
        if (television.getChannel() == Television.MIN_CHANNEL) {
            System.out.println("COMMAND ERROR: min channel reached!"); // send warning
        } else {
            television.channelDown(); // update the channel
        }

        // print new channel
        System.out.println("channel: " + television.getChannel());
    }


}
