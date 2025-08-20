package Assignment3;

//Subclass Book (Book is-a Item)
public class Book extends Item {
 private String author;
 
 // Constructor
 public Book(int id, String title, String author) {
     super(id, title);  // Call parent constructor
     this.author = author;
 }
 
 // Override displayInfo to include author
 @Override
 public void displayInfo() {
     System.out.println("Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
 }
 
 // Getter for author
 public String getAuthor() {
     return author;
 }
}
