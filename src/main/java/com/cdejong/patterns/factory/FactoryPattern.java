package com.cdejong.patterns.factory;

import com.cdejong.patterns.factory.shapes.Shape;

public class FactoryPattern {

    public static void main(String[] args) {

        // initialize the ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // create some shapes
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.createShape(ShapeType.SQUARE);

        // print names
        System.out.println(circle.getName());
        System.out.println(rectangle.getName());
        System.out.println(square.getName());




    }
}
