package day11_nestedLoop;

public class StringImmutable {

	public static void main(String[] args) {
		
		
		// immutable. Immutable simply means unmodifiable or unchangeable

		//- Once String object is created its data or state can't be changed but 
		//a new String object is created.


		String str = "Hello";
		String str2 = " java";
		String str3 = " Hello java";
		String str4 = str + str2;
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str3 == str4); // false (it looks like same value but its immutable/  unchangeable.)
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		
		
		
	}

}
