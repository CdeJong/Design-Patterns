package com.cdejong.patterns.composite;

public class BreakElement implements Element {

    private final static String ELEMENT_NAME = "break";
    private final static String TAB = "\t";

    @Override
    public String getName() {
        return ELEMENT_NAME;
    }

    @Override
    public void printXML(int depth) {
        System.out.println(TAB.repeat(depth) + "<" + ELEMENT_NAME + " />");
    }
}
