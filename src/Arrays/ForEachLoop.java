package Arrays;

public class ForEachLoop {
    public static  void main(String[] args){
        String[] countries = {
                "USA", "Canada", "India", "Germany", "France", "Japan", "Australia"
        };

        for( String country : countries){
            System.out.println(country);
        }

    }
}
