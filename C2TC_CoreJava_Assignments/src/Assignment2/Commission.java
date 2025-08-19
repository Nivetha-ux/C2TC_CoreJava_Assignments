package Assignment2;

import java.util.Scanner;

public class Commission {
    String name;
    String address;
    String phone;
    double salesAmount;

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
        
        sc.close();
    }

    public double calculateCommission() {
        if (salesAmount >= 100000) {
            return salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            return salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.03;
        } else {
            return 0;
        }
    }
}