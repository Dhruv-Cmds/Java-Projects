package ContactManager.v1_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {

    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner;

    public ContactService(Scanner scanner){
        this.scanner = scanner;
    }

    public void addContact(){

        scanner.nextLine();

        while(true) {

            // For Name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println();

            // Check valid name or not
            if (name.trim().isEmpty()) {
                System.out.println("Name cannot be empty.");
                continue;
            }

            // For email
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            // Check valid email or not
            if (email.trim().isEmpty()) {
                System.out.println("Email cannot be empty.");
                continue;
            }

            // Check valid email or not
            if (!email.contains("@")){
                System.out.println("Invalid email");
                continue;
            }

            // For phone
            System.out.print("Enter your (phone number): ");
            String phone = scanner.nextLine();

            // Check valid phone or not
            if (phone.trim().isEmpty()){
                System.out.println("Phone Number cant be empty.");
                continue;
            }

            // Check valid phone or not
            if (phone.length() != 10){
                System.out.println("Invalid (phone number).");
                continue;
            }

            // Check valid phone or not
            if (!phone.matches("\\d{10}")) {
                System.out.println("Phone must be 10 digits.");
                continue;
            }

            Contact contact = new Contact(name , email , phone);
            contacts.add(contact);
            break;
        }
    }

    public  void deleteContact(){

        scanner.nextLine();

        System.out.print("Enter name to delete contact: ");
        String name = scanner.nextLine();

        for (int i = 0; i < contacts.size(); i++){

            if(contacts.get(i).name.equalsIgnoreCase(name)){
                contacts.remove(i);
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void searchContact(){

        scanner.nextLine();

        System.out.print("Enter name to search: ");
        String search = scanner.nextLine();

       for (Contact c : contacts){
           if(c.name.equalsIgnoreCase(search)){
               c.display();
               return;
           }
       }
       System.out.println("Contact not found.");
    }

    public void showAllContact(){

        if(contacts.isEmpty()){
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("All Contacts: ");

        for (Contact c : contacts){
            c.display();
        }
    }
}


