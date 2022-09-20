package javaHelloWorld;

public class stringsDemo {

	public static void main(String[] args) {
	
String text = "Weather is beautiful!" ;
System.out.println(text);
System.out.println("---");

//text uzunluğunu bulmak için
System.out.println("Number of element :"+text.length());
//textin aranan bir noktasında ne yazdığını bulmak için
System.out.println("5th element :"+text.charAt(4));
System.out.println("---");

//variable içine text eklemek için
System.out.println(text.concat(", hurray!"));
System.out.println("---");

//aranılan textin variable içinde olup olmadığını logic olarak sorgular
System.out.println(text.startsWith("Z"));
System.out.println("---");

//textin içinde belli bir noktayı yazdırabilmek için
char[] character = new char [9] ;
text.getChars(11, 20, character, 0);
System.out.println(character);
System.out.println("---");

//textin nerede olduğunu bulmak için
System.out.println(text.indexOf("is"));
System.out.println(text.lastIndexOf("a"));
System.out.println("---");

//texti başka text ile değiştimeye yarar
System.out.println(text.replace("beautiful", "very beautiful"));
String newText = text.replace("beautiful", "awful") ;
System.out.println(newText);
System.out.println("---");

System.out.println(text.substring(8,10));
//arasında kalan texti yazdırır
System.out.println("---");

//kelimeleri ayrı ayrı yazdırmak için
for (String word : text.split(" ")) {
	System.out.println(word);
}
System.out.println("---");

//Tüm texti büyük küçük harf yapmak için
System.out.println(text.toLowerCase());
System.out.println(text.toUpperCase());
System.out.println("---");

//textin başında veya sonunda boşluk varsa atmak için
String newTextt = "     Weather is beautiful!     " ;
System.out.println(newTextt);
System.out.println(newTextt.trim());
	}

}
