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
public class AccountApp {
        public static void main(String[] args) {
//        ArrayList<Account> account = new ArrayList<Account>();
            CheckingAccount account1 = new CheckingAccount(123.3);
            SavingsAccount saveAccount = new SavingsAccount(154.45);
//            account.add(account1);
//            account.add(saveAccount);
            System.out.println(account1);;
        }
}
