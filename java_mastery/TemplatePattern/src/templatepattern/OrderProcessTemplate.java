/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatepattern;

/**
 *
 * @author payal
 */
public abstract class OrderProcessTemplate {
  
    public abstract void doSelect(); 
  
    public abstract void doPayment(); 
    
    public abstract void doDelivery(); 
  
    public final void giftWrap() 
    { 
        try
        { 
            System.out.println("Gift wrap successful"); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Gift wrap unsuccessful"); 
        } 
    }
  
    public final void processOrder(boolean isGift) 
    { 
        doSelect(); 
        doPayment(); 
        if (isGift) { 
            giftWrap(); 
        } 
        doDelivery(); 
    } 
}
