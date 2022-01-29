package com.cdejong.patterns.factory.shapes;

import com.cdejong.patterns.factory.ShapeType;

public interface Shape {

    /**
     * Get the Shape's name.
     * @return String
     */
    String getName();

    /**
     * Get the Shape's shapeType (not rly relevant for this example)
     * @return ShapeType
     */
    ShapeType getType();
}
