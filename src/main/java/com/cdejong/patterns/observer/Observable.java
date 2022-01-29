package com.cdejong.patterns.observer;

public interface Observable {

    /**
     * register a new observer/listener, this observer will now update if notifyObservers(String message) is used.
     * @param observer the observer/listener
     */
    void registerObserver(Observer observer);

    /**
     * unregister an observer/listener, this observer will no longer receive updates through notifyObservers(String message)
     * @param observer the observer/listener
     */
    void unregisterObserver(Observer observer);

    /**
     * notify/send message to al registered observers/listeners
     * @param message the message you like to send
     */
    void notifyObservers(String message);

}
