package com.suraj.behavioral.nullobject;

public class CustomerFactory {

    private Database database;

    public CustomerFactory(Database database) {
        this.database = database;
    }

    public BaseCustomer getCustomer(String name){
        if(database.findCustomer(name))
           return new Customer(name);

        return new NullCustomer();
    }
}
