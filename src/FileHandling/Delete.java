package FileHandling;
import java.io.File;  // Import the File class
public class Delete {
    public  static  void main(String[] args){
        File myfile = new File("myfile.txt");
        if(myfile.delete()){
            System.out.println("Successfully deleted the file : " + myfile.getName());

        }else {
            System.out.println("Failed to delete the file");
        }
    }

}
