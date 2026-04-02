package ControlStatements;

public class IfElse {
    public static void  main(String[] args){


        boolean isRaining = true;
        boolean hasUmbrella = false;

        if(isRaining && hasUmbrella){
            System.out.println("It's raining, you can go outside taking an umbrella.");
        } else if(isRaining && !hasUmbrella){
            System.out.println("It's raining, better stay inside or get wet!");
        } else {
            System.out.println("No rain today, you can go outside freely!");
        }
    }
}
