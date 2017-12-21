/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;

import java.util.Scanner;

/**
 * Adrian Arredondo 18173 p.3 ATM machine
 */
public class ATMMachine {

    public static Scanner in = new Scanner(System.in);
    public static final String USERNAME = "aarredondo";
    public static final int PIN = 1234;
    public static double accountBalance = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Login");
        System.out.println("Enter your username");
        String id = in.nextLine();
        System.out.println("Enter your pin");
        int enterPin = in.nextInt();

        if (id.equals(USERNAME) && enterPin == PIN) {
            accountManagement();

        } else {
            System.out.println("system has locked you out");
            System.exit(0);
        }

    }

    public static void accountManagement() {

        System.out.println(" main menu");
        //System.out.println("Account: " + id);
        System.out.println("Please choose an option");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                accountBalance();
                break;
            case 2:
                depositChecks();
                break;
            case 3:
                withdrawMoney();
                break;
            case 4:
                System.out.println("bye thank you");
                System.exit(0);
            default:
                break;
        }
    }

    public static void accountBalance() {

        System.out.println("Total balance: " + accountBalance);
        accountManagement();
    }

    public static void depositChecks() {
        System.out.println("How many checks do you want to deposit?");
        int checkAmount = in.nextInt();

        double checkTotal = 0;
        for (int i = 0; i < checkAmount; i++) {

            checkTotal += in.nextDouble();
            System.out.println("Deposit check " + i);
        }

        System.out.println("You depposited a total of " + checkTotal);
        accountBalance += checkTotal;
        accountBalance();

    }

    public static void withdrawMoney() {
        System.out.println("How much do you want to withdraw");
        double withdrawAmount = in.nextDouble();

     
        
            accountBalance -= withdrawAmount;
            accountBalance();

       

    }
}
