package com.suraj.lsp;

public class ElectricCar extends Vehicle{

    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void SpeedUp() {
        System.out.println("Electric Car Speeding Up ...");
    }

    @Override
    protected void slowDown() {
        System.out.println("Electric Car Slowing Down ...");
    }

    @Override
    public void fuel() {
        System.out.println("Electric Car is getting charged ...");
    }
}
