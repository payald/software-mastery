/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author payal
 */
public class Collections2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Collection<Car> cars = new ArrayList<>();
        Car c1=new Car(11,"hatchback","tata");
        Car c2=new Car(12,"sedan","tata");
        Car c3=new Car(13,"hatchback","maruti");
        Car c4=new Car(11,"sedan","maruti");
        Car c5=new Car(11,"sedan","maruti");
        cars.addAll(Arrays.asList(c1,c2,c3,c4));
        System.out.println(cars);
        
        if (cars.contains(c5)){
            System.out.println("\nsedan maruti found");
        }
    }
    
}
