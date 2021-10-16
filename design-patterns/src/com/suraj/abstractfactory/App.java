package com.suraj.abstractfactory;

public class App {
    public static void main(String[] args) {
        AbstractFactory electricFactory = FactoryProducer.getFactory("ELECTRIC");
        electricFactory.getCar("TOYOTA").assemble();
        electricFactory.getCar("FORD").assemble();
    }
}
