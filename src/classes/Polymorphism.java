package classes;

class Doctor {
    String name;
    int age;

    // Overloaded methods
    public void DoctorInfo(String name) {
        System.out.println(name);
    }

    public void DoctorInfo(int age) {
        System.out.println(age);
    }

    public void DoctorInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        d1.name = "Sujal";
        d1.age = 23;

        // Works now
        d1.DoctorInfo(d1.name, d1.age);
    }
}