package com.cdejong.patterns.observer;

public interface Observer {

    /**
     * if registered through this method the Observer/Listener gets updated/notified.
     * @param message in this example the message is a String, but you can use any type or even a custom Object.
     */
    void update(String message);

}
