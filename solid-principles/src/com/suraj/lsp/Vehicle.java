package com.suraj.lsp;

public abstract class Vehicle implements Fuel{
    protected String type;
    protected int age;

    public Vehicle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    protected  void SpeedUp(){
        System.out.println("Vehicle Speeding Up ...");
    }

    protected void slowDown(){
        System.out.println("Vehicle Slowing Down ...");
    }

}
