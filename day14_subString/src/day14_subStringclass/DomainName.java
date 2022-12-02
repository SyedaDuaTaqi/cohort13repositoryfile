package day14_subStringclass;

public class DomainName {

	public static void main(String[] args) {
		
		
	String email = "firstName. lastName@aws.com";	
	
		//		input			"john.smith@github.com"
		// 		output 			github
	
		  		
	//String email = "firstName.lastName@aws.com";
	
    int str2 = email.indexOf("@") +1;
    int str3 = email.lastIndexOf(".");
    
    String domain = email.substring(str2,str3);
    System.out.println(domain);
		
		
		
		
		
		
		
	}

}
