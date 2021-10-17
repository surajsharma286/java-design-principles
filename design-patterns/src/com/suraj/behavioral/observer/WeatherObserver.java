package com.suraj.behavioral.observer;

public class WeatherObserver implements Observer{

    private int pressure;
    private int temparature;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temparature = temperature;

        showData();
    }

    private void showData() {
        System.out.println("Pressure : "+this.pressure +" Humidity :"+this.humidity+ " Temparature: "+this.temparature);
    }
}
