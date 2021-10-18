package com.suraj.behavioral.template.games;

public class BasketballGame extends Game{

    @Override
    protected void initialize() {
        System.out.println("Initializing Basketball Game ...");
    }

    @Override
    protected void playing() {
        System.out.println("Playing Basketball Game ...");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing results of Basketball Game ...");
    }
}
