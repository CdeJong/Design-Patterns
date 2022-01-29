package com.cdejong.patterns.observer;

public class LastMessageListener implements Observer {

    private String lastMessage = "";

    @Override
    public void update(String message) {
        System.out.println("UPDATE LAST MESSAGE: " + message);
        lastMessage = message; // set new last message
    }

    /**
     * Get the last message
     * @return String
     */
    public String getLastMessage() {
        return lastMessage;
    }
}
