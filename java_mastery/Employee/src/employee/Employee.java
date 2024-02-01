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
    
    String name;
    Integer age;
    Double salary;
    String location;
    Employee(String name,Integer age,Double salary,String location){
        this.age=age;
        this.location=location;
        this.name=name;
        this.salary=salary;
    }
    
    static void raiseSalary(Employee e,int incr){
        e.salary+=incr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emps[]={new Employee("A",1,1.0,"A"),new Employee("B",11,11.0,"B")};
        for(Employee e:emps){
            System.out.println(e.age+" "+e.location+ " "+e.name+" "+e.salary);
            Employee.raiseSalary(e,10);
        }
        for(Employee e:emps){
            System.out.println("after raise "+e.age+" "+e.location+ " "+e.name+" "+e.salary);
            
        }
    }
    
}
