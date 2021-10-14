package com.suraj.di.refactor;

public class OracleDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database ...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle Database ...");
    }
}
