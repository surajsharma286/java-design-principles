package com.suraj.behavioral.observer.stock;

public class Stock {
    private String ticker;
    private Float value;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "ticker='" + ticker + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
