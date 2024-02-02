/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author payal
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount acc=new BankAccount("Payal", 10000.0);
        System.out.println("Owner "+acc.getOwner()+" balance "+acc.getBalance());
        acc.withdraw(90.0);
        System.out.println(" After withdrawing : Owner "+acc.getOwner()+" balance "+acc.getBalance());
        acc.deposit(9100.0);
        System.out.println(" After deposit : Owner "+acc.getOwner()+" balance "+acc.getBalance());
    }
}
