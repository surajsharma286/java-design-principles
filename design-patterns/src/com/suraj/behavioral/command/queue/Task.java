package com.suraj.behavioral.command.queue;

public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void solveProblem(){
        System.out.println(" Solving the Problem with ID :"+id);
    }
}
