package com.suraj.isp;

public class App {
    public static void main(String[] args){
        Tree bst = new BinarySearchTree();

        bst.insert();
        bst.delete();
        bst.traverse();

        Tree bt = new BalancedTree();

        bt.insert();
        bt.delete();
        bt.traverse();
        // Below methods/behavior are applicable to Balanced Tree only.
        bt.leftRotation();
        bt.rightRotation();
    }
}
