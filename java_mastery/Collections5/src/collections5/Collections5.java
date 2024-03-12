/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections5;

import java.util.Collection;

/**
 *
 * @author payal
 */
public class Collections5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Room r1=new Room("Suite",1,1);
        Room r2=new Room("Suite",1,1);
        Room r3=new Room("Basic",2,2);
        Room r4=new Room("Classic",3,3);
        Room r5=new Room("Classic",3,3);
        
        Room[] rooms=new Room[]{r1,r2,r3,r4,r5};
        RoomService service=new RoomService();
        System.out.println("All rooms");
        service.addRooms(rooms);
        service.displayInventory();
        service.applyDiscount(0.5);
        System.out.println("All rooms after discount");
        service.displayInventory();
        Collection<Room> inventory=service.getRoomsByCapacity(1);
        System.out.println("All rooms with capacity >=1");
        inventory.stream().forEach(r->System.out.println(r));
        inventory=service.getRoomsByRateAndType(3, "Classic");
        System.out.println("All rooms that are classic");
        inventory.stream().forEach(r->System.out.println(r));
    }
    
}
