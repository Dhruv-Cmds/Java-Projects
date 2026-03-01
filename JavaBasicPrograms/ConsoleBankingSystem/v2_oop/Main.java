package ConsoleBankingSystem.v2_oop;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Transaction t = new Transaction();
        Deposit d = new Deposit(t);
        Withdraw w = new Withdraw(t);
        ShowBalance b = new ShowBalance();

        double amount;
        double balance = 0;

        while (true){

            System.out.println("--------------------------");
            System.out.println("Welcome to BANKING SYSTEM ");
            System.out.println("--------------------------");

            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. History");
            System.out.println("5. Exit");

            int choice;

            System.out.print("Choose any option (1-5): ");
            choice = scanner.nextInt();

            if(choice == 1){
                b.show(balance);
            }

            else if(choice == 2){
                System.out.print("Enter amount for deposit: ");
                amount = scanner.nextDouble();
                balance = d.deposit(amount , balance);
            }

            else if(choice == 3){
                System.out.print("Enter amount for withdrawn: ");
                amount = scanner.nextDouble();
                balance = w.withdraw(amount , balance);
            }

            else if(choice == 4){
                t.showHistory();
            }

            else if(choice == 5){
                System.out.println("Thank you for using us! Have a nice day.");
                break;
            }

            else{
                System.out.println("Invalid choice.");
            }
        }
    }
}
