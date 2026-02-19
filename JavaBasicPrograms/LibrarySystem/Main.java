package LibrarySystem;

public class Main {
    
    public static void main(String[] args) {

        // Library System
        
        Library library = new Library();

        Book book1 = new Book("Java Basics", 1);
        Book book2 = new Book("OOP Concepts", 2);
        Book book3 = new Book("Data Structures", 3);

        System.out.println("-------------------------------------");

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        System.out.println("-------------------------------------");
        
        library.showBooks();
        
        System.out.println("-------------------------------------");

        library.removeBooks(2);

        System.out.println("-------------------------------------");
        
        library.showBooks();

        System.out.println("-------------------------------------");
    }   
}
