package classes;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner once

        // Take username input
        System.out.print("Enter username: "); // Use print, not println, so input is on same line
        String username = sc.nextLine();

        // Take password input
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Display inputs
        System.out.println("Username: " + username); // Added colon and space for clarity
        System.out.println("Password: " + password);

        sc.close(); // Close scanner to free resources
    }
}