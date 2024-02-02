/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author payal
 */
public class Employee {
    
    protected String name;
    protected Integer age;
    protected Double salary;
    protected String location;
    Employee(String name,Integer age,Double salary,String location){
        this.age=age;
        this.location=location;
        this.name=name;
        this.salary=salary;
    }
    
    static void raiseSalary(Employee e,int incr){
        e.salary+=incr;
    }

     
}
