/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author payal
 */
public class BankAccount {

    
    private String owner;
    private Double balance;

    BankAccount(String owner,Double startingBalance){
        this.owner=owner;
        this.balance=Math.max(startingBalance, 0);
    }
    
    public String getOwner(){
        return owner;
    }
    
    public Double getBalance(){
        return balance;
    }
    
    public Double withdraw(Double amt){
        if (amt>0){
            this.balance-=amt;
            return amt;
        }
        return 0.0;
    }
    
    public Double deposit(Double amt){
        if (amt>0 && amt<=this.balance){
            this.balance+=amt;
            return amt;
        }
        return 0.0;
    }
}
