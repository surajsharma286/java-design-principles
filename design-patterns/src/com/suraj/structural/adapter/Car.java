package com.suraj.structural.adapter;

public class Car implements Vehicle{
    @Override
    public void accelrate() {
        System.out.println("Car is accelerating");
    }
}
