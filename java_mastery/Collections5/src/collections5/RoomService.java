/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections5;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 *
 * @author payal
 */
public class RoomService {
    private Collection<Room> inventory;

    public RoomService() {
        this.inventory=new LinkedList<>();
    }
    
    public void addRooms(Room[] rooms){
        this.inventory.addAll(Arrays.asList(rooms));
    }
    
    public void displayInventory(){
        this.inventory.forEach(x -> System.out.println(x));
    }
    
    public void applyDiscount(final Double discount){
        this.inventory.forEach(r->r.setRate(r.getRate()*(1-discount)));
    }
    
    public Collection<Room> getRoomsByCapacity(final int requiredCapacity){
        return this.inventory.stream().filter(r->r.getCapacity()>=requiredCapacity).collect(Collectors.toList());
    }
    
    public Collection<Room> getRoomsByRateAndType(final int rate, final String type){
        return this.inventory.stream().filter(r->r.getRate()<=rate).filter(r->r.getType().equals(type)).collect(Collectors.toList());
    }
    
    public boolean hasRoom(Room room){
        return this.inventory.contains(room);
    }
}
