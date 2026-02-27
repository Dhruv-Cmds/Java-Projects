package Bankig;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // JAVA BANKING PROGRAM
        

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("--------------");
            System.out.println("NATIONAL BANK");
            System.out.println("--------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("--------------");
            
            System.out.print("Choose any option (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        } 
        System.out.println("---------------------------");   
        System.out.println("Thank you! have a nice day!.");

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.println("--------------");
        System.out.printf("Total Balance: $%.2f\n" , balance);
    }
    static double deposit(){
        
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount <= 0){
            System.out.println("Amount must be greater than zero.");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){

        double amount;

        System.out.print("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount <= 0){
            System.out.println("Amount must be greater than zero.");
            return 0;
        }
        else if(amount > balance){
            System.out.println("Insufficient.");
            return 0;
        }
        else{
            return amount;
        }
    }
}

