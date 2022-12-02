package day11_nestedLoop;

public class NestedLoopIntro {

	public static void main(String[] args) {
		
//		for (int i = 1; i < 4; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 1; i < 4; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 1; i < 4; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 1; i < 4; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 1; i < 4; i++) {
//			System.out.println(i);
//		}
//		
//		
//		for (int a = 0 ; a < 5 ; a++) {
//			System.out.println("Hello");
//		}
//		
//		
		
		
		
		
		 for (int a = 0 ; a < 5; a++ ) {
	            
	            System.out.println("Value of the a is "+a);
	            
	            for (int i = 1; i < 4; i++) {
	                System.out.println(i);
	            }
	        
	        }
		 
		 
		 
		 
		 
		 
		 
		 
		 // Write a program to print 1 to 10,  7 times;
	        
		    
	        
	        for (int b = 1 ; b <=7 ; b++) { // outer loop
	            System.out.println("iteration #"+b);
	            
	            for (int a = 1; a < 11; a++) { // inner loop
	                System.out.println(a);
	            }
	        }
	}

}
