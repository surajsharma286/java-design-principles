package com.suraj.behavioral.observer.stock;

public class SellStockTrader implements Trader{
    @Override
    public void update(Stock stock) {
        if(stock.getValue() > 105){
            System.out.println(" Selling Stock !! "+ stock);
        }

    }
}
