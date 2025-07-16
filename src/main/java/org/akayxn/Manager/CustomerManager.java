package org.akayxn.Manager;

import org.akayxn.entity.Account;
import org.akayxn.entity.Customer;

import java.util.Scanner;

public class CustomerManager {
    Scanner scanner = new Scanner(System.in);
    public void createAccount(){

        System.out.println("Enter a new username");
        String username = scanner.nextLine();


        System.out.println("Enter a your email:");
        String email = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        System.out.println("Confirm Password:");
        String confirmPassword = scanner.nextLine();


        Customer customer = new Customer();
        Account account = new Account();

        customer.setUsername(username);
        customer.setEmail(email);
        if(password.equals(confirmPassword)) customer.setPassword(password);
        customer.setTransactionPin("0000");
    }

    public void changePassword(Customer customer){
        System.out.println("Enter your old password:");
        String oldPassword = scanner.nextLine();
        if(oldPassword.equals(customer.getPassword())){
            System.out.println("Enter your new password:");
            String password = scanner.nextLine();

            System.out.println("Confirm Password:");
            String confirmPassword = scanner.nextLine();
            if(password.equals(confirmPassword)) customer.setPassword(password);
        }
    }

   public void changePin(Customer customer){
       System.out.println("Enter your old pin");
       String oldPin = scanner.nextLine();
       if(oldPin.equals(customer.getTransactionPin())){
           System.out.println("Enter your new pin (must be 4 numbers):");
           Integer newPin= scanner.nextInt();
           if(newPin.toString().length()==4){
               System.out.println("Confirm Pin:");
//               String confirmPassword = scanner.nextLine();
//               if(password.equals(confirmPassword)) customer.setPassword(password);
//               unfinished

           }


       }
   }


}
