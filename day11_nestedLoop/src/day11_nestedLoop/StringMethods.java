package day11_nestedLoop;

public class StringMethods {

	public static void main(String[] args) {
		// length()   // Returns the number of characters in the string
		//charAt(i);  // Returns the char at position i.
		
		//			  01234556789
		String str = "Techcircle";
		System.out.println(str.length()); //10
		
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(5));
//		System.out.println(str.charAt(6));
//		System.out.println(str.charAt(7));
//		System.out.println(str.charAt(8));
//		System.out.println(str.charAt(9));
		
		
		for (int i = 0; i < str.length(); i++)
		// System.out.println(i);
			System.out.println(str.charAt(i));
		
		

	}

}
