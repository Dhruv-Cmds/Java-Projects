package NumberGuessingGame.v1_basic;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min , max + 1);

        System.out.println("-------------------------------");
        System.out.println("Number Guessing Game:\n");
        System.out.printf("Enter a number between %d-%d\n" , min , max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts += 1;

            if(guess > randomNumber){
                System.out.println("Lower number! ");
            }
            else if (guess < randomNumber){
                System.out.println("Higher number! ");
            }
            else {
                System.out.println("You guessed the number. " + "Number was: " + guess);
                System.out.println("Total attempts that you took was: " + attempts);
            }
        }
        while(guess != randomNumber);
        scanner.close();
    }    
}

// YOU CAN MAKE THIS GAME AS LONG AS YOU WANT
// example:
        // int minimum;
        // int maximum;

        // System.out.println("To start the game you can make hard as much as you want");

        // System.out.print("Chose minimum number you want: ");
        // minimum = scanner.nextInt();

        // System.out.print("Chose maximum number you want: ");
        // maximum = scanner.nextInt();
        
        // int randomNumber = random.nextInt(minimum , maximum + 1);
        
        
        // System.out.println("-------------------------------");
        // System.out.print("Number Guessing Game\n");
        // System.out.printf("Enter a number between %d-%d\n" , minimum , maximum + 1);
        