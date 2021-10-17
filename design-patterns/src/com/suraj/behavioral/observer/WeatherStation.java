package com.suraj.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private int pressure;
    private int temparature;
    private int humidity;
    private List<Observer> observerList;

    public WeatherStation(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setTemparature(int temparature) {
        this.temparature = temparature;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o: this.observerList){
            o.update(pressure,temparature,humidity);
        }

    }
}
