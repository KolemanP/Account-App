/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import static account.CheckingAccount.fee;

/**
 *
 * @author kp0885055
 */
public class Account {
    private double balance;
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0.00){
        this.balance = balance;
        }
        else {
            System.out.println("NOPE");
        }

    }   
    public void credit(double deposit){
        balance = (balance+deposit);
    }  
    public void debit (double withdraw){
        if (balance > (withdraw + fee)){
            balance = (balance-withdraw);
        }
        else {
            System.out.println("Debit amount exceeded account balance");
        }
        
    }
    public void displayInfo(){
    System.out.println(balance);
    }
    }

