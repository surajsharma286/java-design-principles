package com.suraj.structural.decorator;

public class App {
    public static void main(String[] args) {
        Beverage beverage = new Sugar(new Milk(new PlainBeverage()));
        System.out.println(beverage.getCost() + "$ for "+ beverage.getDescription());
    }
}
