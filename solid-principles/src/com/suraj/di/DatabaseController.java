package com.suraj.di;

public class DatabaseController {

    private MySqlDatabase database;

    public DatabaseController(){
        // tight binding when we program to a class instead of interface
        database = new MySqlDatabase();
        database.connect();
        database.disconnect();
    }

}
