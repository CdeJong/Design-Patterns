package com.cdejong.patterns.strategy;

public class MultiplyByTenMultiplier implements Multiplier {

    private final static int MULTIPLY_BY = 10;

    @Override
    public int multiply(int number) {
        return number * MULTIPLY_BY;
    }
}
