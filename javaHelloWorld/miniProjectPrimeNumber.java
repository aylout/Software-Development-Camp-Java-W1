package javaHelloWorld;

public class miniProjectPrimeNumber {

	public static void main(String[] args) {
    int number = 5;
    // % bölü demek
    boolean isPrime = true;
    
    if (number==1) {
    	System.out.println("Number is not a prime number");
    }
    
    if (number<1) {
    	System.out.println("Undefined number");
    }
    
 
    
    for ( int i=2; i<number; i++) {
    	if (number % i == 0) { ;
		isPrime = false; }
	}
    
	if (isPrime) {
		System.out.println("Number is a prime number");
	} else {
		System.out.println("Number is not a prime number");
		
	}

	}

}
