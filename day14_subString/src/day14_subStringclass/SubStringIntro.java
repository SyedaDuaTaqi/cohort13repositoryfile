package day14_subStringclass;

public class SubStringIntro {

	public static void main(String[] args) {
	//				  0123456789
		String str = "television";
		
		// subString (i, k) will return from index i to k -1
		System.out.println(str.substring(2,5));			 
		
		// subString (i) --> return every character string from index i to end
		
		System.out.println(str.substring(4));

		
		String str3 = "Bob";
	
		//System.out.println(str3.substring(9));
		
		
		System.out.println(str.substring(4,7)); // (vis) when we give index it doesn't count the last number
		
		
		
		
		
		
		
		
	}

}
