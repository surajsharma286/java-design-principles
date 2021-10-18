package com.suraj.behavioral.nullobject;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory(new Database());

        System.out.println(customerFactory.getCustomer("Adam").getCustomer());
        // Returns NullCustomer instead of NPE
        System.out.println(customerFactory.getCustomer("Kevin").getCustomer());

    }
}
