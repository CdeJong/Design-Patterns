package com.cdejong.patterns.composite;

public class AnimalElement implements Element {

    private final static String ELEMENT_NAME = "animal";
    private final static String TAB = "\t";

    private final ImageElement image;
    private final TextElement description;

    public AnimalElement(String source, String alternate, String description) {
        this.image = new ImageElement(source, alternate);
        this.description = new TextElement(description);
    }

    @Override
    public String getName() {
        return ELEMENT_NAME;
    }

    @Override
    public void printXML(int depth) {
        System.out.println(TAB.repeat(depth) + "<" + ELEMENT_NAME + ">");
        image.printXML(depth + 1);
        description.printXML(depth + 1);
        System.out.println(TAB.repeat(depth) + "</" + ELEMENT_NAME + ">");
    }
}
