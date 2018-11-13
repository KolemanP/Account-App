/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author kp0885055
 */
public class CheckingAccount extends Account{
    static double fee = 5.35;
    double feeBalance = getBalance();
    double tempbalance;
    
    public CheckingAccount(double tempbalance) {
        this.tempbalance = tempbalance;
        setBalance(tempbalance);
    }
    public void feeCharged(){
        feeBalance=(feeBalance - fee);
    }
    @Override
    public void credit(double deposit){
        feeCharged();
        feeBalance = (feeBalance+deposit);
    }
    @Override
    public void debit (double withdraw){
        feeCharged();        
    if (feeBalance > withdraw){
        feeCharged();
        feeBalance = (feeBalance-withdraw);
    }
    else {
        System.out.println("Debit amount exceeded account balance");
    }

    }
        
    @Override
    public void displayInfo(){
        System.out.println(getBalance());
}
}