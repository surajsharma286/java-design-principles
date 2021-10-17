package com.suraj.behavioral.observer.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Exchange{
    private Stock stock;
    private List<Trader> traderList;
    private float price = 100;
    private Random random;

    public StockExchange(){
        this.traderList = new ArrayList<>();
        this.random = new Random();
        this.stock = new Stock();
    }

    @Override
    public void addTrader(Trader t) {
        this.traderList.add(t);
    }

    @Override
    public void removeTrader(Trader t) {
        this.traderList.remove(t);
    }

    @Override
    public void notifyTraders() {
        for(Trader t: this.traderList)
            t.update(stock);
    }

    public void start(){
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int nextRandomValue = random.nextInt(20);
            if( nextRandomValue % 2 ==0){
                price = price - nextRandomValue;
            }else
            {
                price = price + nextRandomValue;
            }
            System.out.println(price);
            stock.setTicker("Apple");
            stock.setValue(price);
            notifyTraders();
        }
    }
}
