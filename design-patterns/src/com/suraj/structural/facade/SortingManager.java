package com.suraj.structural.facade;

public class SortingManager {
    private Algorithm bubbleSort;
    private Algorithm mergeSort;
    private Algorithm quickSort;

    public SortingManager() {
        this.bubbleSort = new BubbleSort();
        this.mergeSort = new MergeSort();
        this.quickSort = new QuickSort();
    }

    public void doBubbleSort(){
        this.bubbleSort.sort();
    }

    public void doMergeSort(){
        this.mergeSort.sort();
    }

    public void doQuickSort(){
        this.quickSort.sort();
    }
}
