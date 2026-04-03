package classes;

//classes
class Car{
    String brand;
    String model;


    public void carInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);


    }
//non parametrized constructor
    Car(){
        System.out.println("constructor is calling.");
    }

}

public class Constructor {
    public  static void main(String[] args){

        Car car1 = new Car();

        car1.brand = "Rolls Royce";
        car1.model = "ghost";


        car1.carInfo();
    }
}
