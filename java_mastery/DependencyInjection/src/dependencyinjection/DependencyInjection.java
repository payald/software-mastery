/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependencyinjection;

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

// Dependent Class
class Vehicle {
    private Engine engine;

    // Constructor Injection
    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Vehicle with engine type: " + engine.getType() + " started.");
    }
}

// Client Code
public class DependencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create dependency
        Engine dieselEngine = new Engine("Diesel");

        // Inject dependency via constructor
        Vehicle vehicle = new Vehicle(dieselEngine);
        vehicle.start();  // Output: Vehicle with engine type: Diesel started.
    }
    
}
