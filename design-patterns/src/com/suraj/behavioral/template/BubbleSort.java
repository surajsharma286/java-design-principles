package com.suraj.behavioral.template;

public class BubbleSort extends Algorithm{


    public BubbleSort(int[] nums) {
        super(nums);
    }

    @Override
    protected void initialize() {
        System.out.println("\n Initializing the Bubble Sort Algorithm ...");
    }

    @Override
    protected void sorting() {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1; j++)
                if(nums[j] >nums[j+1])
                    swap(j,j+1);
        }
    }

    @Override
    protected void showResult() {
        System.out.print(" Showing Results of Bubble Sort : ");
        for(int num: nums)
            System.out.print(num +" ");
    }
}
