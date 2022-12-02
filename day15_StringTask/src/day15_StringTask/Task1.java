package day15_StringTask;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String input = scan.next();
        String output  = "";
//        System.out.println(input.charAt(0));
//        System.out.println(input.charAt(4));
//        System.out.println(input.length());//5
//        
//        System.out.println(input.charAt(input.length()-1));
        output+= input.charAt(0);
        
        output += input.charAt(input.length()-1);
        System.out.println(output);
        
        scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	// write a program that ask user to enter a sentence and then prints the first and last character of the sentence.	
//					//	012345
//	//	String input = "Welcome To TechCircle"; //"hello";
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a word");
//		String input = scan.next();
//		String output = "";
//		
////		System.out.println(input.charAt(0));
////		System.out.println(input.charAt(4));
////		System.out.println(input.length()); //5
////		
////		
////	System.out.println(input.charAt(input.length()-1));	// more dynamic 
//	output += input.charAt(0);
//	//System.out.println(output);
//	output += input.charAt(input.length()-1);
//	System.out.println(output);
		
		
	scan.close();	
		
		
		
	}

}
