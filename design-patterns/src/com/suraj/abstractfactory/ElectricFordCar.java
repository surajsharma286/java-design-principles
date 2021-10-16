package com.suraj.abstractfactory;

public class ElectricFordCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Ford Electric Car ...");
    }
}
