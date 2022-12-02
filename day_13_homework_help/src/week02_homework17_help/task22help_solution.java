package week02_homework17_help;

public class task22help_solution { public static void main(String [] arg) {
	
	
	
	
	 String str = "TechCircle";
     
     char input = str.charAt(0);
     
     if (input >= 'a' && input <= 'z') {
         System.out.println(input +" is lowercase letter");
     }else if (input >= 'A' && input <= 'Z') {
         System.out.println(input +" is uppercase letter");
     }else if (input >= '0' && input <= '9') {
         System.out.println(input +" is digit");
     }else {
         System.out.println(input + " is a special character");
     }
	
	
	
	
	
	
	
	
	
	
	
	
}
}
