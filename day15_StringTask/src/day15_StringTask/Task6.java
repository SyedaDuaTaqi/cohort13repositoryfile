package day15_StringTask;

public class Task6 {

	public static void main(String[] args) {
		// write a program that can return the initials of the user
		//ex: techcircle school
		//output: T.S
		//Note: Pay attention to the example output

		
		//			  0123456789
		String str = "techircle school";
		
		str = str.toUpperCase();
		System.out.println(str);
		
//		System.out.println(str.lastIndexOf(' ')); // going to display 17 the position of last space
//		
//		System.out.println(str.charAt(18));
//
//		System.out.println(str.charAt(str.lastIndexOf(' ')+1 ));
//		
		String initials = ""+str.charAt(0)+"."+str.charAt(str.lastIndexOf(' ') +1);
		
		System.out.println(initials);
		
		
		
		
		
		
		
		
		
		
		
	}

}
