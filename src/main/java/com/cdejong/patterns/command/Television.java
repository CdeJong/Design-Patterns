package com.cdejong.patterns.command;

/**
 * Some Television "API" used in the commands
 */
public class Television {

    // (public) constants
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    public static final int MIN_CHANNEL = 1;
    public static final int MAX_CHANNEL = 9999;

    // non-static fields
    private boolean isPowered = false;
    private int volume = 99;
    private int channel = 1;

    // turn the tv on
    public void turnOn() {
        if (isPowered) {
            throw new IllegalStateException("Television is already on");
        }
        this.isPowered = true;
    }

    // turn the tv off
    public void turnOff() {
        if (!isPowered) {
            throw new IllegalStateException("Television is already off");
        }
        this.isPowered = false;
    }

    // check if the tv is on
    public boolean isPowered() {
        return isPowered;
    }

    public void volumeDown() {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        if (volume == MIN_VOLUME) {
            throw new UnsupportedOperationException("Minimum volume reached.");
        }
        this.volume -= 1;
    }

    public void volumeUp() {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        if (volume == MAX_VOLUME) {
            throw new UnsupportedOperationException("Maximum volume reached.");
        }
        this.volume += 1;
    }

    public void setVolume(int volume) {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            throw new IllegalArgumentException("Invalid volume.");
        }
        this.volume = volume;
    }

    public int getVolume() {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        return volume;
    }

    public void channelDown() {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        if (channel == MIN_CHANNEL) {
            throw new UnsupportedOperationException("Minimum channel reached.");
        }
        this.channel -= 1;
    }

    public void channelUp() {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        if (channel == MAX_CHANNEL) {
            throw new UnsupportedOperationException("Maximum channel reached.");
        }
        this.channel += 1;
    }

    public void setChannel(int channel) {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
            throw new IllegalArgumentException("Invalid channel.");
        }
        this.channel = channel;
    }

    public int getChannel() {
        if (!isPowered) {
            throw new IllegalStateException("Television is off");
        }

        return channel;
    }
}
