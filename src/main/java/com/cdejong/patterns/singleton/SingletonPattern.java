package com.cdejong.patterns.singleton;

// Singleton classes are perfect for main classes!
public class SingletonPattern {

    // initialize this class static
    private static final SingletonPattern instance = new SingletonPattern();

    // non-static fields
    private final Config config;
    private String username = "default_username";

    // private to prevent anyone else from instantiating
    private SingletonPattern() {
        this.config = new Config();
    }

    // public method that can be used in every class: SingletonPattern.getInstance().getConfig();
    public Config getConfig() {
        return config;
    }

    // public method that can be used in every class: SingletonPattern.getInstance().getUsername();
    public String getUsername() {
        return username;
    }

    //public method that can be used in every class: SingletonPattern.getInstance().setUsername("super_cool_username!");
    public void setUsername(String username) {
        this.username = username;
    }

    // static method to get the singleton's instance: SingletonPattern.getInstance();
    private static SingletonPattern getInstance() {
        return instance;
    }


    public static void main(String[] args) {

        // getting the singleton's instance.
        SingletonPattern singleton = SingletonPattern.getInstance();

        // printing and editing some values from the singleton's instance.
        System.out.println("SECRET KEY: " + singleton.getConfig().getSecretKey());
        System.out.println("USERNAME: " + singleton.getUsername());
        singleton.setUsername("a_new_username");
        System.out.println("USERNAME: " + singleton.getUsername());
    }
}
