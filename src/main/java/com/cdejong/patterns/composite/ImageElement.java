package com.cdejong.patterns.composite;

public class ImageElement implements Element {

    private final static String ELEMENT_NAME = "image";
    private final static String TAB = "\t";

    private final String source;
    private final String alternate;

    public ImageElement(String source, String alternate) {
        this.source = source;
        this.alternate = alternate;
    }

    @Override
    public String getName() {
        return ELEMENT_NAME;
    }

    @Override
    public void printXML(int depth) {
        System.out.println(TAB.repeat(depth) + "<" + ELEMENT_NAME + " source=\"" + source + "\" alternate=\"" + alternate + "\" />");
    }
}
