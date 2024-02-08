/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author payal
 */
public class TVDisplay implements Observer {

    @Override
    public void update(String weather) {
        System.out.println("Weather on TV Display "+weather);
    }
    
}
