package day18_arrayrewiew;

import java.util.Arrays;

public class arrayReview {

	public static void main(String[] args) {
		
		 char chars[] = new char[4];
	        String str = "hello";
	        System.out.println(str.length()); // number of character in my string
	        System.out.println(chars.length); // number of elements in your array
	        
	        System.out.println(chars[1]);
	        
	        chars[0] = 'j';
	        chars[1] = 'a';
	        chars[2] = 'v';
	        chars[3] = 'a';
	        
	        System.out.println(chars[0]);
	        
	        
		
	
		float nums[] = new float [3];
		
		 nums[0] = 2.2f;
		 nums[1] = 4.2f;
		 nums[2] = 6.2f;
		 
		 System.out.println(Arrays.toString(nums));

//		 for (int i = 0 ; i < nums.length ; i++) {
//			 System.out.println(i);
//			 System.out.println(nums[i]);
//		 }
//		 
		 //for (datatype variableName : arrayName) { }
		 
		 for (float juret : nums) {
			 System.out.println(juret);
		 }
		
		 for (char element : chars) {
			 System.out.println(element);
		 }
		 
		 String str2 = "BUY USD SELL RMB";
		 String arr[] = str.split(" ");
		 System.out.println(arr.length); //4
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		 
		 for (int i = 0 ; i < arr.length ; i++) {
	            System.out.println(arr[i]);
	        }
	        
	        for (String word : arr){
	            System.out.println(word);
	        }
	        
	        int index = 0;
	        
	        do {
	            System.out.println(arr[index]);
	            index++;
	        }while(index < arr.length);
	        
	        System.out.println("while loop");
	        index = 0;
	        
	        while (index < arr.length) {
	            System.out.println(arr[index]);
	            index++;
	        }
	        
	}
	

}
