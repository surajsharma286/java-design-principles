package com.suraj.lsp;

public class App {
    public static void main (String[] args){
        Vehicle v = new PetrolCar("Ford",6);

        v.slowDown();
        v.SpeedUp();
        v.fuel();
    }
}
