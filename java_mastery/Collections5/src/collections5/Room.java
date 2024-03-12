/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections5;

import java.util.Objects;

/**
 *
 * @author payal
 */
public class Room {
    private String type;
    private double rate;
    private int capacity;

    public Room(String type, double rate, int capacity) {
        this.type = type;
        this.rate = rate;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public double getRate() {
        return rate;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = (int) (59 * hash + this.rate);
        hash = 59 * hash + this.capacity;
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
        if (this.rate != other.rate) {
            return false;
        }
        if (this.capacity != other.capacity) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }

    @Override
    public String toString() {
        return "Room{" + "type=" + type + ", rate=" + rate + ", capacity=" + capacity + '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
}
