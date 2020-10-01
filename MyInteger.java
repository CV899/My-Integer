
/**
 * Author: Christian Vincent
 * Date: 10/19/2018
 * Description: This program determines if an integer is even, odd,
 * prime, or equal to another integer.
 * 
 */
public class MyInteger {
    private int value;
    
    public MyInteger (int newValue) {
        value = newValue;
    }
    
    //get the value of the integer
    public int getValue() {                 
        return value;
    }
    
    //checks if the value is even
    public boolean isEven() {
        return value % 2 == 0;
    }
    
    //check if the value is odd
    public boolean isOdd() {
        return value % 2 != 0;
    }
    
    //checks if the value is prime
    public boolean isPrime() {
        for(int i = 2; i < value; i++) {
            if(value % i == 0) 
                return false;
       }
        return true;
    }
    
    //check if the value is even (static)
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    //check if the value is odd (static)
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    
    //check if the value is prime (static)
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    //check if the value of the object is even
    public static boolean isEven(MyInteger n) {
        return n.value % 2 == 0;
    }
    
    //check if the value of the object is prime
    public static boolean isPrime(MyInteger o) {
        for(int i = 2; i < o.value; i++) {
            if(o.value % i == 0)
                return false;
        }
        return true;
    }
    
    //check if the value of the object is odd
    public static boolean isOdd(MyInteger o) {
        return o.value % 2 != 0;
    }
    
    //check if a specified value is equal to this object's value
    public boolean equals(int anotherNum) {
        return value == anotherNum;
    }
    
    //checks if this object's value is equal to another object's value
    public boolean equals(MyInteger o) {
        return value == o.value;
    }
    
    
}

