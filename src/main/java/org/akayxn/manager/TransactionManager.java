package org.akayxn.manager;

import org.akayxn.entity.Account;
import org.akayxn.entity.Customer;

import java.util.Scanner;

public class TransactionManager {
    Scanner scanner=new Scanner(System.in);
    Account account= new Account();
    double Balance=account.getAmount();
    public void withdraw(){

        double amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount=scanner.nextDouble();
        if(amount<=Balance){
           Balance=Balance-amount;
           account.setAmount(Balance);
           System.out.println("You have successfully withdrawn the money");
        }
        else {
            System.out.println("Insufficient Amount");
        }
    }
    public void deposit(){
        Account account=new Account();
        AccountNumber=account.getCusId();
        double amount;
        System.out.println("Enter the amount you want to deposit:");
        amount=scanner.nextDouble();
        if(amount<=Balance){
            Balance=Balance-amount;
            account.setAmount(Balance);
            System.out.println("You have successfully deposited the money");
        }
        else {
            System.out.println("Insufficient Amount");
        }

    }
    public void transfer(){
        double amount;
        System.out.println("Enter the amount you want to transfer:");
        amount=scanner.nextDouble();
        if(amount<=Balance){
            Balance=Balance-amount;
            account.setAmount(Balance);
            System.out.println("You have successfully transfer the money");
        }
        else {
            System.out.println("Insufficient Amount");
        }

    }
    public void statement(){

    }
}
