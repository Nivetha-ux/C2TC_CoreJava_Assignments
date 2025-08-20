package Assignment3;

//Subclass Magazine (Magazine is-a Item)
public class Magazine extends Item {
 private int issueNumber;
 
 // Constructor
 public Magazine(int id, String title, int issueNumber) {
     super(id, title);  // Call parent constructor
     this.issueNumber = issueNumber;
 }
 
 // Override displayInfo to include issue number
 @Override
 public void displayInfo() {
     System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
 }
 
 // Getter for issue number
 public int getIssueNumber() {
     return issueNumber;
 }
}
