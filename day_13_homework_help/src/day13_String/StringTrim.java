package day13_String;

public class StringTrim {

	public static void main(String[] args) {
		
		String str = "           hello               ";
		
		System.out.println(str);
		System.out.println(str.length());	
		str = str.trim();
		
		System.out.println(str);
		
		System.out.println(str.length());
		

		String str2 = "      hello        techcircle        ";
		System.out.println(str2);
		System.out.println(str2.length());
		str2 = str2.trim();
		System.out.println(str2);
		System.out.println(str2.length());
	}

}
