package com.cdejong.patterns.command.commands;

import com.cdejong.patterns.command.Command;
import com.cdejong.patterns.command.Television;

public class ChannelUpCommand implements Command {

    private final Television television;

    public ChannelUpCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        // check if television is on
        if (!television.isPowered()) {
            System.out.println("COMMAND ERROR: television is off");
            return;
        }

        // check if max channel is reached
        if (television.getChannel() == Television.MAX_CHANNEL) {
            System.out.println("COMMAND ERROR: max channel reached!"); // send warning
        } else {
            television.channelUp(); // update the channel
        }

        // print new channel
        System.out.println("channel: " + television.getChannel());
    }
}
