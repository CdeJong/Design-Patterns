package com.cdejong.patterns.factory.shapes;

import com.cdejong.patterns.factory.ShapeType;

public class Square implements Shape {

    private final static String name = "Square";
    private final static ShapeType type = ShapeType.CIRCLE;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ShapeType getType() {
        return type;
    }
}
