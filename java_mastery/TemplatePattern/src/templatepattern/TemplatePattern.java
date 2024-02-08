/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatepattern;

/**
 *
 * @author payal
 */
public class TemplatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrderProcessTemplate netOrder = new NetOrder(); 
        netOrder.processOrder(true); 
        System.out.println(); 
        OrderProcessTemplate storeOrder = new StoreOrder(); 
        storeOrder.processOrder(true); 
    }
    
}
