package day13_String;

public class StringContains {

	public static void main(String[] args) {
		String str = "Techcircle";
				
		System.out.println(str.contains("Tech"));
		System.out.println(str.contains("java"));
		
		System.out.println(str.indexOf("Tech"));
		
		System.out.println(str.indexOf("Tech") > -1);  // > -1 gives you the index position so -1 doesn't exist here.

		System.out.println(str.indexOf("xTech") > -1);
	}

}
