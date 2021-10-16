package com.suraj.creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equals("ELECTRIC"))
            return new ElectricCarFactory();
        else if(factory.equals("PETROL"))
            return new PetrolCarFactory();
        else
            return null;
    }
}
