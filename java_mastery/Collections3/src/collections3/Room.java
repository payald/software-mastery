/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections3;

import java.util.Objects;

/**
 *
 * @author payal
 */
public class Room {
    private String type;
    private int capacity;
    private int rate;

    public Room(String type, int capacity, int rate) {
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.type);
        hash = 61 * hash + this.capacity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (this.capacity != other.capacity) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }

    @Override
    public String toString() {
        return "Room{" + "type=" + type + ", capacity=" + capacity + ", rate=" + rate + '}';
    }

    public String getType() {
        return type;
    }

    
    
}
