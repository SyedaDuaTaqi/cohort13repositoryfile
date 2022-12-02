package day18_arrayrewiew;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		
		// Write a program that can count the even and odd number from an array of integers
		// Note: MUST use for each loop
	
		//by irfan
		// dataType arrayName[] = new dataType[size];
        int nums[] = new int[10];
        
        Random random = new Random();
        
//        System.out.println(random.nextInt(100));
//        
//        
        int evenCount = 0;
        int oddCount  = 0;
                
        
        
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(i);
            nums[i] = random.nextInt(15);
            if (nums[i] == 0) {
                nums[i] = random.nextInt(15);
            }
            if (nums[i] %2 == 0) {
                evenCount ++;
            }else {
                oddCount++;
            }
            
        
        }
        
        System.out.println(Arrays.toString(nums));
        
        System.out.println("Even number count :"+evenCount);
        
        System.out.println("Odd number count :"+oddCount);
		
		
		
		
		
		
		
		
		
		
	// by us	
//		 // dataType arrayName[] = new dataType[size];
//        int nums[] = new int[100];
//        
//       
//        for (int i = 0; i < nums.length; i++) {
//           System.out.println(i);
//           nums[i] = 1 + i;
//       }
//		
//		
//        for (int i : nums) {
//            Arrays.sort(nums);
//            
//            if (i % 2==0) {
//            	
//                System.out.println(i + " is an " + " Even Number");
//                                
//            }else {
//                System.out.println(i + " is an " + " Odd Number");
//            }
//            
//        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
