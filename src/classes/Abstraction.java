package classes;

abstract  class ATM {
    // abstract methods (no implementation)
    abstract void withdraw();
    abstract void checkBalance();
// normal method
    public void display(){
        System.out.println("Welcome to ATM");
    }
}


//child class
class  userATM extends ATM{
    @Override
    void withdraw(){
        System.out.println("Money withdrawn");
    }

    @Override
    void checkBalance(){
        System.out.println("Balance is 10000");
    }
}

public class Abstraction {
    public static void main(String[] args){

        ATM atm = new userATM();
        atm.display();
        atm.withdraw();
        atm.checkBalance();

    }
}
