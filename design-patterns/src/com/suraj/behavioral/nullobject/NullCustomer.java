package com.suraj.behavioral.nullobject;

public class NullCustomer extends BaseCustomer{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCustomer() {
        return "";
    }

    @Override
    public String toString() {
        return "NullCustomer{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}
