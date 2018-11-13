/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.ArrayList;
/**
 *
 * @author kp0885055
 */
public class SavingsAccount extends Account{
    double tempoBalance;
    double newBalance;
        public SavingsAccount(double tempoBalance) {
        this.tempoBalance = tempoBalance;
        setBalance(tempoBalance);
        calculateInterest(tempoBalance);
    }
    static double interest = 0.04;
    public void calculateInterest(double tempoBalance){
        interest = (interest*tempoBalance);
        setBalance(tempoBalance+interest);
    }
    @Override
    public void displayInfo(){
        System.out.println(getBalance());
    }
}
