package ConsoleBankingSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // CONSOLE BANKING SYSTEM

        Scanner scanner = new Scanner(System.in);

        double balance = 15000;
        double amount;
        int choice;
        int transactionCount = 0;

        String[] history = new String[100];
        transactionCount = scanner.nextInt();

        do{
            showmanu();

            System.out.print("Choose options (1-4): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> {
                    System.out.printf("Available balance is: %.2f\n" , balance);
                }
    
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine();

                    if(amount > 0) {
                        balance = deposit(balance, amount);
                        history[transactionCount] = "Deposit: $" + amount;
                        transactionCount++;
                    }
                    else {
                        System.out.println("Invalid deposit amount");
                    }
                }
    
                case 3 -> {
                    System.out.print("Enter amount for withdrawn: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine();

                    if (amount > 0 && amount <= balance) {
                        balance = withdraw(balance, amount);
                        history[transactionCount] = "Withdrew: $" + amount;
                        transactionCount++;
                    }
                    else {
                        System.out.println("Invalid withdrawal amount");
                    }
                }

                case 4 -> {
                    
                    if (transactionCount == 0) {
                        System.out.println("No transactions yet.");
                    } else {
                        System.out.println("---- Transaction History ----");
                        for (int i = 0; i < transactionCount; i++) {
                            System.out.println(history[i]);
                        }
                    }
                }

                case 5 -> System.out.println("Thank you for coming! Have a good day!");
                
                default -> System.out.println("Invalid choice!");
            
            }
        }
        while (choice != 5);

            scanner.close();

    }
    static void showmanu() {

        System.out.println("--------------------------");
        System.out.println("Welcome to BANKING SYSTEM ");
        System.out.println("--------------------------");

        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. History");
        System.out.println("5. Exit");
    }

    static double deposit(double balance , double amount){

        balance += amount;
        System.out.println("Amount added to your account.");
                 
        return balance;
    }
    
    static double withdraw (double balance , double amount){
 
        balance -= amount;
        System.out.println("Amount withdrawn successfully from your account.");

        return balance;
    }
}