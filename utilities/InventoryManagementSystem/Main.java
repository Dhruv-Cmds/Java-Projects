package InventoryManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        InventoryManager manager = new InventoryManager();

        int id;
        String name;
        double price;
        int quantity;

        while(true) {

            System.out.println("\nInventory System");
            System.out.println("1 Add Product");
            System.out.println("2 View Products");
            System.out.println("3 Search Product");
            System.out.println("4 Update Quantity");
            System.out.println("5 Total Value");
            System.out.println("6 Exit");

            System.out.print("Choose an option (1-6): ");
            int choice = scanner.nextInt();

            if (choice == 1){

                System.out.print("Product ID: ");
                id = scanner.nextInt();
                // avoid next line buffer
                scanner.nextLine();

                System.out.print("Product Name: ");
                name = scanner.nextLine();

                System.out.print("Product Price: ");
                price = scanner.nextDouble();
                // avoid next line buffer
                scanner.nextLine();

                System.out.print("Product Quantity: ");
                quantity = scanner.nextInt();

                manager.addProduct(id , name , price , quantity);
            }

            else if (choice == 2){

                manager.showProduct();
            }

            else if (choice == 3){

                System.out.print("Enter Product ID: ");
                id = scanner.nextInt();

                manager.searchProduct(id);
            }

            else if (choice == 4){
                System.out.print("Enter Product ID: ");
                id = scanner.nextInt();

                System.out.print("Enter New Quantity: ");
                quantity = scanner.nextInt();

                manager.updateQuantity(id , quantity);

            }

            else if (choice == 5){
                manager.totalValue();
            }

            else if (choice == 6){

                System.out.println("Thank you for!");
                break;
            }

            else{
                System.out.println("Invalid choice.");
            }
        }
    }
}