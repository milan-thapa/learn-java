package ControlStatements;

public class NestedForLoop {
    public static void main(String[] args){

        for(int i=1;i<=2; i++){
            System.out.println("class " + i);
            for(int j=1; j<=3; j++){
                System.out.println("subject:" + j);
            }
        }
    }
}
