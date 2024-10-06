/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setterinjection;

/**
 *
 * @author payal
 */
// Dependency Class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
class Vehicle {
    private Engine engine;

    // Default Constructor
    public Vehicle() {}

    // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        if (engine != null) {
            System.out.println("Vehicle with engine type: " + engine.getType() + " started.");
        } else {
            System.out.println("Engine is not set. Vehicle cannot start.");
        }
    }
}

// Client Code
public class SetterInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle = new Vehicle();
        
        // Inject dependency via setter
        Engine petrolEngine = new Engine("Petrol");
        vehicle.setEngine(petrolEngine);
        
        vehicle.start();  // Output: Vehicle with engine type: Petrol started.
    }
    
}
