package com.suraj.behavioral.template.games;

public abstract class Game {
    protected abstract void initialize();
    protected abstract void playing();
    protected abstract void showResults();

    public final void play(){
        initialize();
        playing();
        showResults();
    }
}
