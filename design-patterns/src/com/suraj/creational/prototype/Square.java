package com.suraj.creational.prototype;

public class Square extends Shape{

    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println(" Square with Width :"+width +" Height : "+height);
    }

    @Override
    public Shape cloneObject() {
        return new Square(width,height);
    }
}
