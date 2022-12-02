package day17_array;

import java.util.Arrays;

public class InitializingAnArray {

	public static void main(String[] args) {
		
		
	int [] nums = new int[5]; // initialized an array that can store 5 elements
	
	System.out.println(nums.length); // 5
		
	System.out.println(nums[0]);	// 0 default value
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	System.out.println(nums[3]);
	System.out.println(nums[4]);
	//System.out.println(nums[6]);	// error
		
		nums[4] = 90;
		
		System.out.println(nums); // memory location
		
		System.out.println(Arrays.toString(nums));
		
		nums [1] = 50;
		System.out.println(Arrays.toString(nums));
		
		nums [1] = 5000;
		System.out.println(Arrays.toString(nums));
		
		
		String fruits[] = new String[3]; // put array [] with string after variable name or after data type otherwise it won't work
		
		fruits[0] = "Apple";
		fruits[1] = "Orange";
		fruits[2] = "Banana";
		
		System.out.println(fruits[1]);
		
		fruits[1] = "Water Melon"; // we can reassign the value and it will work
		System.out.println(fruits[1]);
		

		fruits[3] = "Orange"; 
		System.out.println(fruits[3]);
		
		
	}

}
