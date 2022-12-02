package day14_subStringclass;

public class ConvertNumberToString {

	public static void main(String[] args) { //highlight string and right click -> go to declaration and you'll see java.lang
		
		int num = 10;
		int num2 = 20;
		int num3 = num + num2;
		
		String str1 = "" + num;
		System.out.println(str1);
				
		String str2 = ""+num2;	
		System.out.println(str2);
		
		String str3 = str1 + str2; // + sign between two string is going to become concatenation
		System.out.println(str3);
		
		double price = 9.99;
		
		String str4 = ""+price;
		System.out.println(str4.length()); //4
		System.out.println(str4.charAt(1));
		
		String str5 = Integer.toString(num3);
		System.out.println(str5);
		System.out.println(str4.charAt(0));
		
		String str6 = Double.toString(price); // another way to convert numeric value to string

		System.out.println(str6);
		
		float num5 = 9.31f; // for float and long we need to mention l or f with number.
		
		String str7 = Float.toString(num5);
		System.out.println(str7.length()); //4
		
		long id = 6564879646L;
		System.out.println(Long.toString(id).length());
		
		String str8 = String.valueOf(false);
		System.out.println(str8.length());
		System.out.println(String.valueOf(num5));
		
		String city = "Bloomington";
			
				System.out.println(city.indexOf('3'));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
