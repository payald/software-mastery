/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author payal
 */
public class PhoneDisplay implements Observer {
    private String weather;
    
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
    
    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
    
}
