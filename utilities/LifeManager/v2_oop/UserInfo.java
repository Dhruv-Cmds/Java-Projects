package LifeManager.v2_oop;

import java.util.Scanner;

public class UserInfo {

    protected String name;
    protected int age;
    protected boolean isStudent;

    public void info() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            if (name.isEmpty() || name.contains(" ")) {
                System.out.println("Name must not contain space and must not be empty!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age <= 0) {
                System.out.println("Age must be greater than zero!");
                continue;
            }
            break;
        }

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();
    }
}