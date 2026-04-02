package Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int[][] numbers = {{1,2,3,4,5},{6,7,8,9}};
        System.out.println(numbers[1][2]);

        String[][] Fruits= {
                {"banana", "mango" ,"Apple"},
                {"Orange","Avogardo", "Quiwi", "Grapes"}};
        Fruits[1][2] = "Papaya";
        System.out.println(Fruits[1][2]);

    }
}
