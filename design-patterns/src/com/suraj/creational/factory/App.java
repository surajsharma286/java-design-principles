package com.suraj.creational.factory;

public class App {
    public static void main(String[] args){
        Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();
    }
}
