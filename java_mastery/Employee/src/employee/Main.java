/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author payal
 */
public class Main {
    public static void main(String []args){
        
        Employee emps[]={new Employee("A",1,1.0,"A"),new Employee("B",11,11.0,"B")};
        for(Employee e:emps){
            System.out.println(e.age+" "+e.location+ " "+e.name+" "+e.salary);
            Employee.raiseSalary(e,10);
        }
        for(Employee e:emps){
            System.out.println("after raise "+e.age+" "+e.location+ " "+e.name+" "+e.salary);
            
        }
        
        Analyst analyst=new Analyst("A",1,10000.0,"A",0.5);
        SalesPerson salesPerson=new SalesPerson("A",1,10000.0,"A",0.5,10);
        System.out.println("Analyst bonus "+analyst.getBonus());
        System.out.println("Analyst bonus "+salesPerson.getCommission());
    }
}
