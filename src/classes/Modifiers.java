package classes;

// Parent class
class Account {
    String nationality;        // default
    public String name;        // public
    protected String email;    // protected
    private String password;   // private

    // Setter for private field
    public void setPassword(String password) {
        this.password = password;
    }

    // Method to display info
    public void showDetails() {
        System.out.println("Nationality: " + nationality);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: [HIDDEN]");
    }

    // Method inside same class accessing private field
    public void showPassword() {
        System.out.println("Password (inside class): " + password);
    }
}

// Child class (to demonstrate protected)
class User extends Account {
    public void accessProtected() {
        System.out.println("Accessing protected email: " + email); //  allowed
    }
}

public class Modifiers {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.nationality = "Nepali";   //  default (same package)
        acc.name = "Milan";           //  public
        acc.email = "milan@gmail.com"; //  protected (same package)
        acc.setPassword("1234");      //  private via setter

        acc.showDetails();
        acc.showPassword();

        // Child class access
        User u = new User();
        u.email = "user@gmail.com"; //  protected works in subclass
        u.accessProtected();
    }
}