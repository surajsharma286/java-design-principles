package com.suraj.behavioral.visitor;

public class ShapeExporter implements Visitor{

    @Override
    public void visit(Circle circle) {
        System.out.println("Exporting Circle ...");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Exporting Rectangle ...");
    }
}
