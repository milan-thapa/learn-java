package FileHandling;
import java.io.File;
import java.io.IOException;

public class Create {
    public  static void main(String[] args){
        try{
            File myfile = new File("C:\\Users\\thapa\\OneDrive\\Desktop\\project\\myfile.txt");
            if(myfile.createNewFile()){
                System.out.println("File Created succesfully " +  myfile.getName());
            }else {
                System.out.println("File already exist.");
            }
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace(); // print error details
        }
    }
}
