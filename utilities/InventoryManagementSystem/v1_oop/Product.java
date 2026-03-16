package InventoryManagementSystem.v1_oop;

public class Product {

    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayInfo(){
        System.out.println("Product id: " + id + " | " +
                           "Product name: " + name + " | " +
                           "Product price: " + price + " | " +
                           "Product quantity: " + quantity);
    }
}
