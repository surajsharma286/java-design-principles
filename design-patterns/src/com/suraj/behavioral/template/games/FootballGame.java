package com.suraj.behavioral.template.games;

public class FootballGame extends Game{

    @Override
    protected void initialize() {
        System.out.println("Initializing Football Game ...");
    }

    @Override
    protected void playing() {
        System.out.println("Playing Football Game ...");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing results of Football Game ...");
    }
}
