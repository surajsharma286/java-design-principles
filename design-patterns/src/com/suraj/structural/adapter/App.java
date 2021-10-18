package com.suraj.structural.adapter;

public class App {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle car = new Car();
        Vehicle cycle = new BicycleAdapter(new Bicycle());

        bus.accelrate();
        car.accelrate();
        cycle.accelrate();

    }
}
