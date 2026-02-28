package LibrarySystem.v1_basic;
public class Book {
    
    String title;
    int id;

    Book(String bookName , int id){
        this.title = bookName;
        this.id = id;
    }

    void showInfo(){
        System.out.println("Title: " + title + " Id: " + id);
    }
}
