package com.cdejong.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ListElement implements Element {

    private final static String ELEMENT_NAME = "list";
    private final static String TAB = "\t";

    private final List<Element> children = new ArrayList<>();

    public void addElement(Element element) {
        children.add(element);
    }

    public void removeElement(Element element) {
        children.remove(element);
    }

    @Override
    public String getName() {
        return ELEMENT_NAME;
    }

    @Override
    public void printXML(int depth) {

        System.out.print(TAB.repeat(depth) + "<" + ELEMENT_NAME);
        if (children.isEmpty()) {
            System.out.println(" />");
            return;
        }
        System.out.println(">");

        for(Element child : children) {
            child.printXML(depth + 1);
        }

        System.out.println(TAB.repeat(depth) + "<" + ELEMENT_NAME + "/>");
    }
}
