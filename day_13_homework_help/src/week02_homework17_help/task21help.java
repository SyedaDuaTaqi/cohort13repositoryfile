package week02_homework17_help;

public class task21help {

	public static void main(String[] args) {
		
		int input = 3179;
		
		int A = input / 1000;
		int D = input % 10;	
		input = input /10;
		int C = input % 10;
		input = input / 10;
		int B = input % 10;
		
		
		
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		
		
		System.out.println(A+B+C+D);

	}

}
