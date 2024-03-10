/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections2;

import java.util.Objects;

/**
 *
 * @author payal
 */
public class Car {
    private int mileage;
    private String type;
    private String company;

    public Car(int mileage, String type, String company) {
        this.mileage = mileage;
        this.type = type;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car{" + "mileage=" + mileage + ", type=" + type + ", company=" + company + '}';
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + Objects.hashCode(this.company);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Car c = (Car)obj;
        System.out.println("");
        System.out.format("Caomparing %s %s with %s %s",c.getCompany(),c.getType(),this.company,this.type);
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return Objects.equals(this.company, other.company);
    }
    
    
}
