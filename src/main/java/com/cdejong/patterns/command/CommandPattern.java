package com.cdejong.patterns.command;

import com.cdejong.patterns.command.commands.ChannelDownCommand;
import com.cdejong.patterns.command.commands.ChannelUpCommand;
import com.cdejong.patterns.command.commands.PowerCommand;
import com.cdejong.patterns.command.commands.VolumeDownCommand;
import com.cdejong.patterns.command.commands.VolumeUpCommand;

public class CommandPattern {

    public static void main(String[] args) {
        // create a television
        Television television = new Television();

        // create a remote for the television, this remote has 5 "programmable buttons"
        Remote remote = new Remote();

        // create actions/commands for the buttons from the remote
        Command powerCommand = new PowerCommand(television); // needs the television (api) to control it.
        Command volumeUpCommand = new VolumeUpCommand(television); // needs the television (api) to control it.
        Command volumeDownCommand = new VolumeDownCommand(television); // needs the television (api) to control it.
        Command channelUpCommand = new ChannelUpCommand(television); // needs the television (api) to control it.
        Command channelDownCommand = new ChannelDownCommand(television); // needs the television (api) to control it.

        remote.setButton1(powerCommand); // set button1 as power button
        remote.setButton2(volumeUpCommand); // set button2 as volume up button
        remote.setButton3(volumeDownCommand); // set button3 as volume down button
        remote.setButton4(channelUpCommand); // set button4 as channel up button
        remote.setButton5(channelDownCommand); // set button5 as channel down button

        // test the remote
        remote.pressButton2(); // volume up button, doesn't work because tv is off
        remote.pressButton1(); // power button, let's turn the tv on
        remote.pressButton2(); // volume up button, this time it works (volume: 100)
        remote.pressButton2(); // volume up button, 100 is max
        remote.pressButton5(); // channel down button, doesn't work because 0 is the lowest channel.
        remote.pressButton4(); // channel up button (channel: 1)
        remote.pressButton3(); // volume down button, this channel is very loud, lets turn it down a bit (volume: 99)
        remote.pressButton3(); // volume down button (volume: 98)
        remote.pressButton3(); // volume down button (volume: 97)
        remote.pressButton3(); // volume down button (volume: 96)
        remote.pressButton3(); // volume down button (volume: 95)
        remote.pressButton1(); // power button, turn the tv off

    }
}
