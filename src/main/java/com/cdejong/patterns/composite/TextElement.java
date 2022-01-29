package com.cdejong.patterns.composite;

public class TextElement implements Element {

    private final static String ELEMENT_NAME = "text";
    private final static String TAB = "\t";

    private final String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public String getName() {
        return ELEMENT_NAME;
    }

    @Override
    public void printXML(int depth) {
        System.out.println(TAB.repeat(depth) + "<" + ELEMENT_NAME + ">" + text + "</" + ELEMENT_NAME + ">");
    }
}
