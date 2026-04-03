package FileHandling;
import java.io.File;   // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

import java.util.Scanner;   // Import the Scanner class to read text files
public class Read {
    public static void main(String[] args){
         File myfile = new File("C:\\Users\\thapa\\OneDrive\\Desktop\\project\\myfile.txt");
        // try-with-resources: Scanner will be closed automatically
        try(Scanner myReader = new Scanner(myfile)){
            while (myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }

        }catch (FileNotFoundException e){

            System.out.println("An error occured.");
            e.printStackTrace();

        }
    }
}
