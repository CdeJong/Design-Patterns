package com.cdejong.patterns.strategy;

import java.util.ArrayList;

public class StrategyPattern {

    public static void main(String[] args) {
        NumberList numberList = new NumberList();

        // add some numbers.
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.print();

        // multiply with the MultiplyBySixMultiplier Strategy
        numberList.multiply(new MultiplyBySixMultiplier());
        numberList.print();

        // multiply with the MultiplyBySixMultiplier Strategy
        numberList.multiply(new MultiplyByTenMultiplier());
        numberList.print();

        // multiply with the Multiplier.multiplyBy(int multiplyBy) Strategy, this is a static in the Multiplier interface
        numberList.multiply(Multiplier.multiplyBy(5));
    }

    // custom NumberList with a new method multiply
    public static class NumberList extends ArrayList<Integer> {

        /**
         * multiplies the whole list with a multiplier
         * @param multiplier an instance of Multiplier interface
         */
        public void multiply(Multiplier multiplier) {
            replaceAll(multiplier::multiply);
            // replaceAll(number -> multiplier.multiply(number));
        }

        /**
         * Simple method to print the list
         */
        public void print() {
            forEach(System.out::println);
            // forEach(number -> System.out.println(number));
        }
    }

}
