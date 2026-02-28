package LibrarySystem.v1_basic;
public class Library {

    Book [] book = new Book[5];
    int count = 0;

    void addBooks(Book b){
        if(count >= book.length){
            System.out.println("Library is full.");
            return;
        }

        book[count] = b;
        count++;
        
        System.out.println(b.title + " Title added to library.");
    }

    void showBooks(){

        if (count == 0){
            System.out.println("No books in library.");
            return;
        }
        System.out.println("Books in library:");
        for(int i = 0; i < count; i++){
            book[i].showInfo();
        }
    }
    void removeBooks(int id){

        for (int i = 0; i < count; i++){
            if(book[i].id == id){

                for (int j = i; j < count - 1; j++) {
                    book[j] = book[j + 1];
                }

                book[count - 1] = null;
                count--;

                System.out.println("Removed Book from library.");
                return;  

            }
        }

        System.out.println("Book not found.");

    }
}