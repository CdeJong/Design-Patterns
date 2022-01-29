package com.cdejong.patterns.strategy;

public interface Multiplier {

    int multiply(int number);

    static Multiplier multiplyBy(int multiplyBy) {
        return number -> number * multiplyBy;
    }

}
