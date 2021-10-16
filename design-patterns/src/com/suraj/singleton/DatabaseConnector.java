package com.suraj.singleton;

import javax.xml.crypto.Data;

public class DatabaseConnector {
    // lazy
    private static DatabaseConnector INSTANCE ;

    // "Reflection Attack"
    private DatabaseConnector(){

    }

    public static DatabaseConnector getINSTANCE(){
        // If we have multiple Threads ??
        if(INSTANCE == null)
            // this block can be entered by a single Thread
            //PROBLEM : it is too slow
            synchronized (DatabaseConnector.class){
                INSTANCE = new DatabaseConnector();
                return INSTANCE;
            }
        else
        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting to Database ...");
    }

    public void disconnect(){
        System.out.println("Disconnecting from Database ...");
    }

}
