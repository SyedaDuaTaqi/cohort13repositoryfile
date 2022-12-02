package day17_array;

public class Fruits {

	public static void main(String[] args) {
		
String fruits[] = {"Pineapple","apple","Kiwis","Orange","Mango"};
        
        //Write a program to loop above array. 
        
        
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(fruits[i].toUpperCase());
        }
        
        
        int nums[] = {1,20,-30,4,6};
        int max = nums[0];
        
        for (int i = 0 ; i < 5 ; i++) {
            //System.out.println(nums[i]);
            
            if (nums[i] > max) {
                max = nums[i];
            }
            
        }
        
        System.out.println(max);
        
//        
//        int a = 4;
//        int b = 20;
//        int max =2;
//        
//        if (a > max) {
//            max = a;
//        }
//        
//        if (b > max) {
//            max = b;
//        }
//        
//        System.out.println(max);
		
		
		
		
		
				
				
	}

}
