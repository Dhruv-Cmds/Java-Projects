package PinLockSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Secret PIN Lock System

        Scanner scanner = new Scanner(System.in);

        String correctPin = "1234";
        String userPin;
        int attempts = 0;
        boolean accessGranted = false;

        for (int i = 1 ; i <= 3 ; i += 1){

            System.out.print("Enter 4-digit pin: ");
            userPin = scanner.next();
            attempts += 1;
            
            if(userPin.length() == 4 && (userPin).equals(correctPin)){
                System.out.println("Access Granted.");
                System.out.println("Total attempts: " + attempts);
                accessGranted = true;
                break;
            }
            else{
                System.out.println("Try Again!");
                System.out.println("Remaking attempts: " + (3 - attempts));
            }
        }
        if (!accessGranted) {
        System.out.println("Account Locked!");
        }
        scanner.close();
    }
}