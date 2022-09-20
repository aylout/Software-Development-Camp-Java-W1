package javaHelloWorld;

public class numberFinding {

	public static void main(String[] args) {

		int [] numbers = new int [] {1,2,5,7,9,0} ;
		int numberSearch = 5 ;
		boolean ifThere = false;
		
		for (int i=0; i<=5; i++) {
			if (numbers [i] == numberSearch) {
				ifThere = true;
				break;
					}
		}
		
		if (ifThere) {
		System.out.println("Number is found") ; 
		} else {
		System.out.println("Number is not found") ;
		}
		
		}
}
		