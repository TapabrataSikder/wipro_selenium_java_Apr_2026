package Hasp_map;

import java.util.HashMap;
import java.util.Map;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}

public class Library_manage {

	public static void main(String[] args) {
		Map<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java Programming");
        Book b2= new Book("Data Structures");
        Book b3= new Book("Algorithm Design");

        library.put(b1, true);
        library.put(b2, true); 
        library.put(b3, false); 

        borrowBook(library, b1);
        borrowBook(library, b3);


	}
	public static void borrowBook(Map<Book, Boolean> lib, Book book) {
        if (!lib.containsKey(book)) {
            System.out.println("Book not found");
        } else if (lib.get(book)) {
            
            lib.put(book, false); 
            System.out.println("Success: borrowed '" + book + "'.");
        } else {
            System.out.println(book + "' checked out.");
        }

}}
