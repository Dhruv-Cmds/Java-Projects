package ContactManager.v1_oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ContactService service = new ContactService(scanner);

        while(true){

            // Main menu
            System.out.println("\n==== Contact Manager ====");
            System.out.println("1 Add contact");
            System.out.println("2 Delete contact");
            System.out.println("3 Search contact");
            System.out.println("4 Show all contacts");
            System.out.println("5 Exit");

            // User choice start from here
            int choice;

            // To avoid crash use try catch block
            try{
                System.out.print("Choose an option (1-5): ");
                choice = scanner.nextInt(); // clean leftover flow
                scanner.nextLine();
            }

            // To catch user invalid input
            catch (InputMismatchException e){
                System.out.println("Invalid choice type!");
                scanner.nextLine(); // To prevent infinite loop
                continue;
            }

            // To catch any other invalid input
            catch (Exception e){
                System.out.println("Something went wrong.");
                scanner.nextLine(); // To prevent infinite loop
                continue;
            }

            // You can use (if - else)
            switch (choice){

                case 1 -> {
                    service.addContact();
                }

                case 2 -> {
                    service.deleteContact();
                }

                case 3 -> {
                    service.searchContact();
                }

                case 4 -> {
                    service.showAllContact();

                }

                case 5 -> {
                    System.out.println("Exiting...");
                    System.out.println("Exit");
                    scanner.close();
                    return;
                }
                
                default -> System.out.println("Choice out of range.");
            }
        }
    }
}
