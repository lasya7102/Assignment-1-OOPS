package assignment3;

import java.io.*;
import java.util.*;

class Book implements Serializable {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book [Title=" + title + ", Author=" + author + ", Price=" + price + "]");
    }
}

class p4 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", "James Gosling", 350));
        books.add(new Book("Effective Java", "Joshua Bloch", 550));

        // Serialize list of books
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.ser"))) {
            oos.writeObject(books);
            System.out.println("Books stored in file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize list of books
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.ser"))) {
            List<Book> restoredBooks = (List<Book>) ois.readObject();
            System.out.println("Books retrieved from file:");
            for (Book b : restoredBooks) {
                b.display();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
