package day18_arrayrewiew;

public class classMates {

	public static void main(String[] args) {
		
		/*
		Create an array named classmates, and store 10 of your classmates' full names
		            print the initials of each classmates in separate lines
		 */

		
		
		
		
		
		String names[] = {"Zolboo Enkhbayar", "Nesirdin Hesen", "Brandon Flores", "Kimberly Sristienvong", 
				"Nazanin Gerami", "Roman Panas", "Ablimit Adil", "Maharem Jeroff", "Abhijay Kilkarni", "Zolboo Badralt"};
		
		System.out.println(names.length);
		
		System.out.println(names[0]);
		System.out.println(names[9]);
		System.out.println(names[names.length-1]);
		
		
		for (int i = 0 ; i < names.length ; i++) {
//			System.out.println(i);
//			System.out.println(names[i]);
			String name = names[i];
			
	//		System.out.println(name.charAt(0));
			
			String arr[] = name.split(" ");
			
			System.out.println(arr[0].charAt(0));
			System.out.println(arr[1].charAt(0));
			System.out.println(arr[arr.length-1].charAt(0));
		}
	}

}
