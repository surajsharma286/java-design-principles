package com.suraj.creational.singleton;

public enum Database {
    // Acquiring the INSTANCE is Thread Safe as Enums are compile constants
    INSTANCE;

    public void connect(){
        System.out.println("Connecting to Database ...");
    }

    public void disconnect(){
        System.out.println("Disconnecting from Database ...");
    }

}
