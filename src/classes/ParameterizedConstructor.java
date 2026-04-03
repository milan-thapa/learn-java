package classes;

class Book {
    String genre;
    String title;
    String author;

    // Parameterized constructor
    Book(String genre, String title, String author) {
        this.genre = genre;
        this.title = title;
        this.author = author;
    }

    // Method to display book info
    public void bookInfo() {
        System.out.println("Genre: " + genre);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {

        // Creating book object using parameterized constructor
        Book book1 = new Book("Adventure", "The Alchemist", "Paulo Coelho");

        // Display book info
        book1.bookInfo();
    }
}