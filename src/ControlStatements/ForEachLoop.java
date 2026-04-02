package ControlStatements;

public class ForEachLoop {
    public static  void main(String[] args){
        String[] cars = {"Rolls Royce", "Mercedis Benz", "Ferrari",  "Bugati", "Porche","BMW", "Jaguar"};
        for(String car : cars){
            System.out.println(car);
        }
    }
}
