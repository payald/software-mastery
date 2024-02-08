/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpattern;

/**
 *
 * @author payal
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherStation weatherStation = new WeatherStation();
 
        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();
 
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);
 
        // Simulating weather change
        weatherStation.setWeather("Sunny");
    }
    
}
