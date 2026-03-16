package InventoryManagementSystem.v1_oop;

public class InventoryManager {

    // Creat an array that contains 100 products at a time
    Product[] product = new Product[100];

    // Count of items that user bought
    int count;

    public void addProduct (int id , String name , double price , int quantity){

        product[count] = new Product(id , name , price , quantity);
        count++;

        System.out.println("Product added.");
    }

    public void showProduct (){

        for(int i = 0; i < count; i++){
            product[i].displayInfo();
        }
    }

    public void searchProduct (int id){

        for(int i = 0; i < count; i++) {
            if (product[i].id == id) {
                product[i].displayInfo();
            }
        }

        System.out.println("Product not found.");
    }

    public void updateQuantity(int id, int newQty){

        for (int i = 0; i < count; i++){
            if (product[i].id == id){
                product[i].quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    public void totalValue(){

        double total = 0;

        for (int i = 0; i < count; i++){
            total = product[i].price * product[i].quantity;
        }

        System.out.printf("Total Inventory Value: $%.2f" , total);
    }

}


