
/**
 * Author: Christian Vincent
 * Date: 10/19/2018
 * Description: This program tests the MyInteger class by
 * creating instances of the class and using its methods.
 * 
 */
public class TestMyInteger {

    public static void main(String[] args) {
        
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        System.out.println("15 is even? " + MyInteger.isEven(15));
        
        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
        
        System.out.println("n2 is even? " + MyInteger.isEven(n2));
        System.out.println("n2 is odd? " + MyInteger.isOdd(n2));
        System.out.println("n2 is prime? " + MyInteger.isPrime(n2));
        
        System.out.println("-5 is odd? " + MyInteger.isPrime(-5));
        System.out.println("-24 is even? " + MyInteger.isEven(-24));
        System.out.println("-15 is odd? " + MyInteger.isOdd(-15));
    }
    
}
