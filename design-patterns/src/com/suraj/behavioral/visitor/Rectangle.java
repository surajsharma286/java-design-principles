package com.suraj.behavioral.visitor;

public class Rectangle implements Shape{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
