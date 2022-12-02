package day11_nestedLoop;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("How long do you want to wait?");
        
        int waitTime = scan.nextInt();
        
        System.out.println(waitTime + " timer starts!");
        
        for (int minute  = waitTime -1; minute >=0 ; minute--) {
//            System.out.println(minute);
            
            for(int second = 59 ; second >=0; second--) {
//                System.out.println(second);
                
                System.out.println(minute+"m "+second+"s");
                Thread.sleep(10);
            }
        }
        
        System.out.println("Time is up!!");
    
        scan.close();

		
		
		
		
		

	}

}
