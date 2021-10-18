package com.suraj.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());

        ShapeExporter shapeExporter = new ShapeExporter();

        for(Shape s: shapes)
            s.accept(shapeExporter);

    }
}
