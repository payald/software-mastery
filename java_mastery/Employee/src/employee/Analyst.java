/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author payal
 */
public class Analyst extends Employee {
    private final Double bonusPercentage;
    public Analyst(String name, Integer age, Double salary, String location,Double bonusPercentage) {
        super(name, age, salary, location);
        this.bonusPercentage=bonusPercentage;
    }
    public Double getBonus(){
        return this.bonusPercentage*super.salary;
    }
    
}
