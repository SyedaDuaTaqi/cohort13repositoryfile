package day14_subStringclass;

public class Task5 {

	public static void main(String[] args) {
	
//		Your team has created a new bank website that requires email address to be validated. 
//		The email string must contain an '@' character. The email string must contain an '.' character.
//		The '@' must contain at least one character in front of it. e.g. "a@example.com" is valid while "@example.com" is invalid. 
//		The '.' and '@' must be in the appropriate places. 
//		e.g. "mike.smith@com" is invalid while " mike.smith@example.com" is valid. For a given string, 
//		find a solution that writes true on the console if an email is valid and false if it is invalid.
//		Examples: str = "test@example.com" --> true str = "test@example.co.in --> true str = "@example.com" --> fals

		String email = "test@example.com";
		
		boolean hasAt = false;
		boolean hasDot = false;
		boolean hasCharacterbeforeAt = false;
		boolean hasDotAfterAt = false;
		
		if(email.contains("@")) {
			hasAt = true;
			} 
		
		if(email.contains(".")) {
			hasDot = true;
			} 
		
//		if(email.indexOf("@") >= 1) {
//			hasCharacterbeforeAt = true;
	//		} 
		if (email.charAt(0) != '@') { 
			hasCharacterbeforeAt = true;
		}
		
		if(email.lastIndexOf(".") >  email.indexOf("@")) {
			hasDotAfterAt = true;
			} 
		if ( hasAt && hasDot && hasCharacterbeforeAt && hasDotAfterAt) {
			System.out.println(true);
		}else System.out.println(false);
	}

}
