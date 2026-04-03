package Errors;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5}; // numbers to guess from
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Guess a number between 1 and 5: ");
            int guessNum = Integer.parseInt(sc.nextLine()); // convert input to int

            boolean found = false;
            for (int num : array) {
                if (guessNum == num) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Congratulations! You guessed the right number.");
            } else {
                System.out.println("Wrong guess.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            System.out.println("Try-catch executed successfully.");
            sc.close();
        }
    }
}