package com.suraj.behavioral.visitor;

public class Circle implements Shape{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
