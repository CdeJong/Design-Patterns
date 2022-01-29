package com.cdejong.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements Observable {

    // list with registered observers
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {

        // if observer is null or the observer already exists.
        if (observer == null || observers.contains(observer)) {
            return;
        }

        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer); // only removes if exists
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message); // send message to each registered Observer.
        }
    }
}
