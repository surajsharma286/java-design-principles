package com.suraj.structural.adapter;

public class BicycleAdapter implements Vehicle{

    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelrate() {
        this.bicycle.go();
    }
}
