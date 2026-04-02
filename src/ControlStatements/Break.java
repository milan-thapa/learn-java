package ControlStatements;

public class Break {
    public static  void main(String[] args){
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break; // exit loop when i is 3
            }
            System.out.println(i);
        }
    }
}
