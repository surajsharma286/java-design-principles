package com.suraj.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        OperationsManager manager = new OperationsManager();
        manager.setStrategy(new Addition());
        manager.execute(10,5);

        manager.setStrategy(new Multiplication());
        manager.execute(10,5);

        manager.setStrategy(new Substraction());
        manager.execute(10,5);
    }
}
