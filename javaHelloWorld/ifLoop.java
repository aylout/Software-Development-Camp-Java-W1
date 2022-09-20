package javaHelloWorld;

public class ifLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1 = 500 ;
		int no2 = 600 ;
		int no3 = 700 ;
		// if döngüsü içinde int yazınca hata veriyor
		int biggest = no1 ;
		
		if (no2 > no1) {
			biggest = no2 ;
		}
		
		if (no3 > no1) {
			biggest = no3 ;
		}
		
		System.out.println("The biggest number is: "+biggest);
		
	}

}
