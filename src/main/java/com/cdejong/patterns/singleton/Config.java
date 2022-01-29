package com.cdejong.patterns.singleton;

// just an example class, hardcoded.
public class Config {

    private final static String SECRET_KEY = "ThisIsASecretKeyInTheConfigClass";

    public String getSecretKey() {
        return SECRET_KEY;
    }
}
