package com.suraj.srp.refactor;

public class App {
    public static void main(String[] args){
        System.out.println("Welcome to the Refactored App !! \n");
        Pair pair = InputProcessor.input();

        if(!ViolationChecker.validate(pair)){
            System.out.println("Inputs is not valid !!");
            return;
        }

        int result = Operation.execute(pair);

        System.out.println("Result is : "+result);
    }
}
