package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Write {
    public  static void main(String[] args) {


        try{

            FileWriter  mywriter = new FileWriter("C:\\Users\\thapa\\OneDrive\\Desktop\\project\\myfile.txt");
            mywriter.write("hello world , my name is milan thapa and i am from pyuthan.");
            mywriter.close();
            System.out.println("Successfully wrote a file.");
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    }
