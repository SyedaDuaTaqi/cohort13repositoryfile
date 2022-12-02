package day13_String;

public class StringConcatination {

	public static void main(String[] args) {
		
		
		//String str1 = "Re" , str2 = "think" , str3 = "ing";
		// with concat we can only add string
		
		String str1 = "Re" ;
		String 	str2 = "think" ;
		String str3 = "ing";
		String result = str1 + str2;
		System.out.println(result);
		
		result += str3; // Rethink + ing
		
		System.out.println(result);
		
		String result2 = str1.concat(str2);
		System.out.println(result2);
		
		
		int num = 2;
		
		result = result + 2;
		System.out.println(result);
		
		//result2 = result2.concat(2)
		
		result = result + true;
		System.out.println(result); // we can add any data type with + but only string with concatination
		
	}

}
