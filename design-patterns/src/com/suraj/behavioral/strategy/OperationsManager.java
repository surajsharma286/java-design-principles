package com.suraj.behavioral.strategy;

//abstract layer between the high level modules and low level modules
public class OperationsManager {
    // We have to use composition
    // Because the Behavior cna be changed at Run-Time
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(int num1,int num2){
        this.strategy.execute(num1,num2);
    }

}
