package com.suraj.behavioral.template;

public class App {
    public static void main(String[] args) {

        int[] nums = {1,5,3,-2,10,12,8,6,5};

        Algorithm bubbleSorting = new BubbleSort(nums);
        bubbleSorting.sort();

        Algorithm selectionSort = new SelectionSort(nums);
        selectionSort.sort();
    }
}
