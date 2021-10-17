package com.suraj.behavioral.iterator;

public class NameRepository {
    private String[] names = {"Adam","John","Sarah","Joe"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
