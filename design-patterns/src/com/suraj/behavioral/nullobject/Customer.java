package com.suraj.behavioral.nullobject;

public class Customer extends BaseCustomer{

    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getCustomer() {
        return this.customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}
