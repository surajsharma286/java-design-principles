package com.suraj.lsp;

public class PetrolCar extends Vehicle{

    public PetrolCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected  void SpeedUp(){
        System.out.println("Petrol Car Speeding Up ...");
    }

    @Override
    protected void slowDown(){
        System.out.println("Petrol Car Slowing Down ...");
    }

    @Override
    public  void fuel(){
        System.out.println("Petrol Car Refuelling ...");
    }
}
