package classes;

class  Vehicle{
    String brand;

    public void start(){
        System.out.println("Vehicle is Starting..");
    }

}


class Plane extends Vehicle{
    public void fly(){
        System.out.println( brand + " is flying.");
    }
}

class Bike extends Vehicle{
    public void ride(){
        System.out.println(brand + " bike is driving.");
    }
}


public class Inheritance {
    public  static  void main(String[] args){

        Plane c = new Plane();
        c.brand = "Black Bird Aeroplane";
        c.start();
        c.fly();



        Bike b = new Bike();
        b.brand = "BMW";
        b.start();
        b.ride();




    }
}
