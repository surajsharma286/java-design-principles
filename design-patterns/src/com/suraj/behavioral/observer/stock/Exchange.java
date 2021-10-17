package com.suraj.behavioral.observer.stock;

public interface Exchange {
    public void addTrader(Trader t);
    public void removeTrader(Trader t);
    public void notifyTraders();
}
