package com.suraj.behavioral.command.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {

    private BlockingQueue<Command> commandList;

    public Algorithm() {
        this.commandList = new ArrayBlockingQueue<Command>(10);
    }

    public void produce(){
        try {
            for(int i=0;i<10;i++)
                commandList.put(new TaskSolver(new Task(i+1)));
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void consume(){
        try {
            for(int i=0;i<10;i++) {
                Thread.sleep(1000);
                commandList.take().execute();
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
