package com.suraj.behavioral.command.queue;

public class TaskSolver implements Command{
    private Task task;

    public TaskSolver(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        this.task.solveProblem();
    }
}
