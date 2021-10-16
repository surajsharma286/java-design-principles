package com.suraj.creational.abstractfactory;

public class PetrolCarFactory implements AbstractFactory{
    @Override
    public Car getCar(String type) {
        
        if(type.equals("FORD"))
        return new PetrolFordCar();
        else if(type.equals("TOYOTA"))
            return new PetrolToyotaCar();
        else
            return null;
    }
}
