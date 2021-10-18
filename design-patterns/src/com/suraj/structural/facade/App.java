package com.suraj.structural.facade;

public class App {
    public static void main(String[] args) {
        SortingManager sortingManager = new SortingManager();
        sortingManager.doBubbleSort();
        sortingManager.doMergeSort();
        sortingManager.doQuickSort();

    }
}
