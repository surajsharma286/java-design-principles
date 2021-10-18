package com.suraj.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> shapes;

    // We will create a rectangle for every color
    public ShapeFactory(){
        this.shapes = new HashMap<>();
    }
    // get a shape based on a given color
    public Shape getShape(String color){
        if(shapes.containsKey(color))
            return shapes.get(color);

        System.out.println("Creating a Rectangle with color : "+color);
        Shape shape = new Rectangle(color);
        shapes.put(color,shape);
        return shape;
    }
}
