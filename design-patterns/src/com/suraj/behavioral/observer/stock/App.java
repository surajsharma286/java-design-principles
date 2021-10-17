package com.suraj.behavioral.observer.stock;

public class App {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        stockExchange.addTrader(new BuyStockTrader());
        stockExchange.addTrader(new SellStockTrader());
        stockExchange.start();
    }
}
