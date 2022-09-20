package javaHelloWorld;

public class loopDemo {

	public static void main(String[] args) {

		//for döngüsü
		// 1 1 arrtır = i++, 1 1 azalt = i--
		
		for ( int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Finish the 'for' loop");
		
		//while döngüsü
		int i = 1 ;
		while (i<10) {
			System.out.println(i);	
			i++;
		}
		System.out.println("Finish the 'while' loop");
		
		//Do-while
		int j=1 ;
		do {
			System.out.println(j);
			j+=2 ;
		} while (j<10) ;
		System.out.println("Finish the 'do-while' loop");
	}

}
