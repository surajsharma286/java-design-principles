package com.suraj.abstractfactory;

public class PetrolToyotaCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Petrol Toyota Car ...");
    }
}
