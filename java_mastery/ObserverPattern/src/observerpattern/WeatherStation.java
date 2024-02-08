/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author payal
 */
public class WeatherStation implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private String weather;
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
 
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
 
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }
    
    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}
