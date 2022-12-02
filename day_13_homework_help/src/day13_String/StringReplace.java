package day13_String;

public class StringReplace {

	public static void main(String[] args) {
		
		String str1 = "car";
		String str2 = str1.replace('r', 't');
		System.out.println(str2);
		
		String email = "test@gmail.com";
		
		String email2 = email.replace("gmail", "yahoo");
		System.out.println(email2);

	}

}
