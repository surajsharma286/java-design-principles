package com.suraj.isp;

public interface Tree {

    //lets create a fat interface

    public void insert();
    public void delete();
    public void traverse();

    // methods related to Balanced tree
    public void leftRotation();
    public void rightRotation();
}
