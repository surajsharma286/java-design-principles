package com.suraj.behavioral.observer.stock;

public class BuyStockTrader implements Trader{

    @Override
    public void update(Stock stock) {
        if(stock.getValue() < 95)
            System.out.println(" Buying Stock !! "+ stock);
    }
}
