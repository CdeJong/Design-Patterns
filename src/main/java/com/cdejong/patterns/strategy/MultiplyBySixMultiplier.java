package com.cdejong.patterns.strategy;

public class MultiplyBySixMultiplier implements Multiplier {

    private final static int MULTIPLY_BY = 6;

    @Override
    public int multiply(int number) {
        return number * MULTIPLY_BY;
    }
}
