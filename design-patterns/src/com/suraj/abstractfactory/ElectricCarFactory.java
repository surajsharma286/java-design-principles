package com.suraj.abstractfactory;

public class ElectricCarFactory implements AbstractFactory{
    @Override
    public Car getCar(String type) {

        if(type.equals("FORD"))
        return new ElectricFordCar();
        else if(type.equals("TOYOTA"))
            return new ElectricToyotaCar();
        else
            return null;
    }
}
