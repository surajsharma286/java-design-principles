package com.suraj.creational.prototype;

public class Rectangle extends Shape{

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println(" Rectangle with Width :"+width +" Height : "+height);
    }

    @Override
    public Shape cloneObject() {
        return new Rectangle(width,height);
    }
}
