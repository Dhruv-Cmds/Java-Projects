package LifeManager.v2_oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        StudyTime studyTime = new StudyTime();
        Bmi bmi = new Bmi();
        BirthdayCounter bc = new BirthdayCounter();
        Motivation motivation = new Motivation();

        // user info once
        studyTime.info();

        while (true) {

            System.out.println("\n------- Welcome to Life Manager -------");
            System.out.println("=== Main Menu ===");
            System.out.println("1. BMI Calculator");
            System.out.println("2. Study Time Calculator");
            System.out.println("3. Random Motivation");
            System.out.println("4. Countdown to Birthday");
            System.out.println("5. Exit");

            System.out.print("Select any one option: ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {

                System.out.print("Enter your height (meters): ");
                double height = scanner.nextDouble();

                System.out.print("Enter your weight (kg): ");
                double weight = scanner.nextDouble();

                bmi.b(weight, height);

            } else if (userChoice == 2) {

                System.out.print("Enter daily study hours: ");
                double hours = scanner.nextDouble();

                studyTime.sT(0, hours, "");

            } else if (userChoice == 3) {

                motivation.mtvn();

            } else if (userChoice == 4) {

                System.out.print("Days left until your birthday: ");
                int days = scanner.nextInt();

                bc.bday(days);

            } else {
                System.out.println("Good bye, see you soon.");
                break;
            }
        }

        scanner.close();
    }
}