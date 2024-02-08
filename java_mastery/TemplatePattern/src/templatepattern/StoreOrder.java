/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatepattern;

/**
 *
 * @author payal
 */
public class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() 
    { 
        System.out.println("Customer chooses the item from shelf."); 
    } 
  
    @Override
    public void doPayment() 
    { 
        System.out.println("Pays at counter through cash/POS"); 
    } 
  
    @Override
    public void doDelivery() 
    { 
        System.out.println("Item delivered to in delivery counter."); 
    } 
}
