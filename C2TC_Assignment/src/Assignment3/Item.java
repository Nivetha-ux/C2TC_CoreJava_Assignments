package Assignment3;

//Base class Item
public class Item {
 protected int id;
 protected String title;
 
 // Constructor
 public Item(int id, String title) {
     this.id = id;
     this.title = title;
 }
 
 // Method to display basic item information
 public void displayInfo() {
     System.out.println("ID: " + id + ", Title: " + title);
 }
 
 // Getters
 public int getId() {
     return id;
 }
 
 public String getTitle() {
     return title;
 }
}
