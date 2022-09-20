package javaHelloWorld;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char grade = 'Z';
      
      switch (grade) {
      case 'A' :
    	  System.out.println("perfect, pass");
      break;
      case 'B' :
    	  System.out.println("very good, pass");
    	  break;
      case 'C' :
    	  System.out.println("good, pass");
    	  break;
      case 'D' :
    	  System.out.println("not bad, pass");
    	  break;
      case 'E' :
      case 'F' :
    	  System.out.println("Bad, failed");
    	  break;
      default: 
    	  System.out.println("Undefined grade");
      }
	}

}
