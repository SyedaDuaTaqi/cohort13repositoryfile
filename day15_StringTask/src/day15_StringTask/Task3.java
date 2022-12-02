package day15_StringTask;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		//				01234
		String input = "pizza";
		String output = " ";
		
//		System.out.println(input.charAt(4));
//		System.out.println(input.charAt(3));
//		System.out.println(input.charAt(2));
//		System.out.println(input.charAt(1));
//		System.out.println(input.charAt(0));
		for(int i= 4;i>=0;i--){  
			
		//	System.out.println(input.charAt(i));
			output += input.charAt(i);
		}
			
			if(input.length() < 5) {
				System.out.println("Too short");
			}else if(input.length() > 5) {
				System.out.println("Too long!");
			}
		
	//	StringBuilder sb = new StringBuilder(input); can use for work only
	//	System.out.println(sb.reverse());
		
	
	}

	}
