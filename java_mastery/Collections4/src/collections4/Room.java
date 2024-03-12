/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections4;

import java.util.Objects;

/**
 *
 * @author payal
 */
public class Room {
    private String type;
    private int capacity;
    private int rate;
    private boolean isPetFriendly;

    public void setIsPetFriendly(boolean isPetFriendly) {
        this.isPetFriendly = isPetFriendly;
    }

    public boolean isIsPetFriendly() {
        return isPetFriendly;
    }

    public Room(String type, int capacity, int rate) {
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
        this.isPetFriendly=false;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + this.capacity;
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
    
    
    
}
