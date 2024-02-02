/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author payal
 */
public class SalesPerson extends Employee {
    private Double commissionPercentage;
    private Integer totalSales;
    public SalesPerson(String name, Integer age, Double salary, String location,Double commissionPercentage,Integer totalSales) {
        super(name, age, salary, location);
        this.commissionPercentage=commissionPercentage;
        this.totalSales=totalSales;
    }
    public Double getCommission(){
        return totalSales*this.commissionPercentage*super.salary;
    }
}
