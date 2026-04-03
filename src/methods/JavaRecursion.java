package methods;

public class JavaRecursion {
    static int sum(int n){
        if(n == 0){
            return 0;
        }else{
            return n + sum(n - 1);
        }
    }
 public  static  void main(String[] args){
        int sum = sum(5);
        System.out.println("The sum of natural numbers of a given number is " + sum);
 }

}
