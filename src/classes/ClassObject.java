package classes;

// creating class
class Pen {
    String color;
    String type;

    // method
    public void write() {
        System.out.println("Writing something");
    }

    public void display() {
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
    }
}

// main class
public class ClassObject {
    public static void main(String[] args) {

        // creating objects
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Green";
        pen2.type = "Ballpoint";

        // method calls
        pen1.write();
        pen1.display();

        pen2.write();
        pen2.display();
    }
}