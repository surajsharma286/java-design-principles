package com.suraj.abstractfactory;

public class PetrolFordCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Petrol Ford Car ...");
    }
}
