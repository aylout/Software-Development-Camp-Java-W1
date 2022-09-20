package javaHelloWorld;

public class arraysDemo {

	public static void main(String[] args) {
		String student1 = "Emanuel" ;
		String student2 = "Daniel" ; 
		String student3 = "Samuel" ;

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		// variable da büyük küçük harf farkediyor
		
		System.out.println("-----");
		
		String[] students = new String [4] ;
		// javada sıralama 0'dan başlıyor
		students [0] = "Emanuel" ;
		students [1] = "Daniel" ;
		students [2] = "Samuel" ;
		students [3] = "Arjan" ;
		
		for (int i=0 ; i < students.length; i++) {
		System.out.println(students[i]) ;
			
		}
		
		System.out.println("-----");
		
		for (String student:students) {
			System.out.println(student);
			
		}
	}

}
