package com.suraj.creational.singleton;

public class App {

    public static void main(String[] args) {
	    Object o1 = DatabaseConnector.getINSTANCE();
        Object o2 = DatabaseConnector.getINSTANCE();

        if (o1==o2)
            System.out.println("Objects are the Same");

        Object o3 = Database.INSTANCE;
        Object o4 = Database.INSTANCE;

        if(o3==o4)
            System.out.println("Objects are the Same !!");
    }
}
