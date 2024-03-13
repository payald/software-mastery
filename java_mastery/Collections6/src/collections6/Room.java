/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections6;

import java.util.Objects;

/**
 *
 * @author payal
 */
public class Room {
    private int capacity;
    private int rate;
    private String type;

    public Room(String type, int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }

    public String getType() {
        return type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.capacity;
        hash = 19 * hash + this.rate;
        hash = 19 * hash + Objects.hashCode(this.type);
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
        if (this.rate != other.rate) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }

    @Override
    public String toString() {
        return "Room{" + "capacity=" + capacity + ", rate=" + rate + ", type=" + type + '}';
    }
    
    
}
