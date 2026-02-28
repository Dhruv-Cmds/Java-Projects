package Bankig.v2_oop;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        ShowBalance balance = new ShowBalance();
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();

        double amount;
        double balances = 0;

        int choice;

        while(true){
            System.out.println("--------------");
            System.out.println("NATIONAL BANK");
            System.out.println("--------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("--------------");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            if(choice == 1){
                balance.showAmount(balances);
            }

            else if (choice == 2){
                System.out.print("Enter amount for deposit: ");
                amount = scanner.nextDouble();
                balances = deposit.deposit(balances , amount);
            }

            else if (choice == 3){
                System.out.print("Enter amount for withdrawn: ");
                amount = scanner.nextDouble();
                balances = withdraw.withdraw(amount , balances);
            }

            else if (choice == 4){
                System.out.println("Thank you!");
                break;
            }
        }


    }
}
