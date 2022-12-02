package day13_String;

public class StringIndexOf {

	public static void main(String[] args) {
		
		String name = "President George Washington";
		
		
		System.out.println(name.indexOf('P'));
		System.out.println(name.indexOf('G'));
		System.out.println(name.indexOf('W'));
		System.out.println(name.indexOf('X'));
		
		
		System.out.println(name.indexOf('e' , 10));
		
		System.out.println(name.indexOf("George"));
		
		
		
		
		System.out.println(name.indexOf("ashi"));
		
		System.out.println(name.indexOf("Bob"));
		
		System.out.println(name.indexOf("President"));
		
		System.out.println(name.indexOf("eo"));
		
		System.out.println(name.lastIndexOf('e'));
		
//		String gmail = "Test@gmail.com";
//		
//		if (gmail.indexOf(gmail) > -1) {
//			System.out.println("Gmail account"); // going to display nothing because the condition is wrong it tells nothing.
//		}
//		
//		
		
		
		
		
		
		
	}

}
