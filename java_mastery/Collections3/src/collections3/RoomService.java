/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author payal
 */
public class RoomService {
    private Collection<Room> inventory;

    public RoomService() {
        this.inventory=new HashSet<>();
    }
    
    public boolean hasRoom(Room room){
        return this.inventory.contains(room);//equals and hashcode is reqd in Room class
    }
    
    public Room[] asArray(){
        //returns the rooms in the order they were added hence LinkedHashSet to maintain order
        return this.inventory.toArray(new Room[0]);
    }
    
    public Collection<Room> getByType(String type){
        //original list must not be modified
        Collection<Room> copy = new HashSet<>(this.inventory);
        copy.removeIf(r->!r.getType().equals(type));
        return copy;
    }
    
    public void removeRoom(Room room){
        this.inventory.remove(room);
    }
    
    public Collection<Room> getInventory(){
        return new HashSet<>(this.inventory);
    }
    
    public void createRooms(Room rooms[]){
        this.inventory.addAll(Arrays.asList(rooms));
    }
    
    public void createRoom(String type, int capacity,int rate){
        this.inventory.add(new Room(type,capacity,rate));
    }
}
