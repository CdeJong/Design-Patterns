package com.cdejong.patterns.observer;

public class ObserverPattern {

    public static void main(String[] args) {

        // new unregistered observer/listener
        LastMessageListener lastMessageListener = new LastMessageListener();

        // observable (with EventManager as Implementation)
        Observable eventManager = new EventManager();
        eventManager.registerObserver(lastMessageListener); // register the observer/listener

        eventManager.notifyObservers("Hello World!"); // notify/send message to all observers/listeners
        eventManager.notifyObservers("Hey World!"); // notify/send message to all observers/listeners
        eventManager.notifyObservers("Hi World!"); // notify/send message to all observers/listeners

        // print the last message from the observer/listener
        System.out.println("LAST MESSAGE #1: " + lastMessageListener.getLastMessage()); // should print: "LAST MESSAGE: Hi World!!!"

        eventManager.unregisterObserver(lastMessageListener); // unregister the observer/listener

        eventManager.notifyObservers("Hello World!!!"); // notify/send message to all observers/listeners, but there aren't any!

        // print the last message from the observer/listener
        System.out.println("LAST MESSAGE #2: " + lastMessageListener.getLastMessage()); // should still print: "LAST MESSAGE: Hi World!!!"

    }

}
