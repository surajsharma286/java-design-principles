package com.suraj.abstractfactory;

public class ElectricToyotaCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Toyota Electric Car ...");
    }
}
