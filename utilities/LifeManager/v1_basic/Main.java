package LifeManager.v1_basic;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        
        // Welcome to Life Manager

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;
        
        while(true){

            // Input name
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
    
            if(name.isEmpty() || name.contains(" ")){
                System.out.println("Name must not contains space and not be empty: ");
                continue;
            }
            break;
        }

        while (true) {
            
            // Input age
            System.out.print("Enter Your age: ");
            age = scanner.nextInt();
    
            if(age <= 0){
                System.out.println("AGE must me greater than zero!");
                continue;
            }
            break;
        }

        System.out.print("Are you a student?:");
        isStudent = scanner.nextBoolean();

        while (true) {  

            System.out.println("-------Welcom to Life manager-------");
            
            System.out.println("===Main Menu===");                    
            System.out.println("1. BMI Calculator");                    
            System.out.println("2. Study Time Calculator");                 
            System.out.println("3. Random Motivation");                    
            System.out.println("4. Countdown to Birthday");                   
            System.out.println("5. Exit");  

            // Select option
            int userChoice;
            
            System.out.print("Select any one option: ");
            userChoice = scanner.nextInt();
            
            // Bmi Calculator
                    
            if(userChoice == 1){

                while (true) {
                    
                    double height; // meters
                    double weight; //kg
                    double bmi;

                    System.out.print("Enter your height:");
                    height = scanner.nextDouble();
                    
                    System.out.print("Enter your weight:");
                    weight = scanner.nextDouble();

                    bmi = weight / (height * height);

                    if (bmi < 18.5) {
                        System.out.println("You are Underweight.");
                    }
                    else if (bmi <= 24.9) {
                        System.out.println("Your weight is Normal.");
                    }
                    else if (bmi <= 29.9) {
                        System.out.println("You are Overweight.");
                    }
                    else {
                        System.out.println("You are Obese.");
                    }
                    break;
                }
            }

            // Study Time Calculator

            double hours;
            double weekly;
            String student;

            if (userChoice == 2){

                if (isStudent){
                    System.out.print("How much hours you study per day?: ");
                    hours = scanner.nextDouble();
                        
                    weekly  = 7 * hours;

                    student = (weekly >= 40) ? "Beast mode" : "Needs focus";
                    System.out.println(student);
                }
                else{
                    System.out.println("You are not a student.");
                }
           }

           // Random Motivation

           if (userChoice == 3){

                Random random = new Random();

                int randomNumber = random.nextInt(1 , 4);

                switch (randomNumber) {
                    case 1 -> System.out.println("Stay disciplined.");
                    case 2 -> System.out.println("Consistency beats intensity.");
                    case 3 -> System.out.println("Small progress daily.");        
                }
           }
           
           // Countdown to Birthday

           if (userChoice ==  4){

                int days;

                System.out.println("How many days is your birthday?");
                days = scanner.nextInt();

                for (int i = days ; i > 0 ; i--){
                    System.out.println(i);
                    Thread.sleep(500);
                }
                System.out.println("🎉 Happy Early Birthday!");
           }
           // End of program

           if(userChoice == 5){

                System.out.println("Good bye, see you soon.");
                break;
           }
        }
        scanner.close();
    }        
}
