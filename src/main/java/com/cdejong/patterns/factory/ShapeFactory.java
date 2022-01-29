package com.cdejong.patterns.factory;

import com.cdejong.patterns.factory.shapes.Circle;
import com.cdejong.patterns.factory.shapes.Rectangle;
import com.cdejong.patterns.factory.shapes.Shape;
import com.cdejong.patterns.factory.shapes.Square;

public class ShapeFactory {

    /**
     * Create a shape by ShapeType
     * @param type the type
     * @return an implementation of Shape
     */
    Shape createShape(ShapeType type) {

        // if type == null or not in switch return null as default
        Shape shape = null;

        switch (type) {
            case CIRCLE -> shape = new Circle();        // if type == CIRCLE: initialize Circle
            case SQUARE -> shape = new Square();        // if type == SQUARE: initialize Square
            case RECTANGLE -> shape = new Rectangle();  // if type == RECTANGLE: initialize Rectangle
        }

        // creation message (if shape is not null)
        if (shape != null) {
            System.out.println(shape.getName() + " created successfully!");
        }

        // return the initialized shape
        return shape;

    }

}
