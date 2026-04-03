package classes;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }



}

public class Example1 {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "Milan Thapa";
        s1.age = 23;

        Student s2 = new Student();
        s2.name ="Aswin Thapa";
        s2.age = 25;


        s1.printInfo();
        s2.printInfo();

    }
}
