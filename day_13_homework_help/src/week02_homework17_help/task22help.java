package week02_homework17_help;

public class task22help {

	public static void main(String[] args) {
		
		

		char letter1 = 'a';
        int num1 = letter1;
        System.out.println(num1); // 97
        
        char letter2 = 'z';
        int num2 = letter2;
        
        
        for (int i = num1 ; i <= letter2; i++) {
            char letter = (char)i;
            System.out.println(letter);
        }
        
        
        for (int i = 65 ; i <= 90; i++) {
            char letter = (char)i;
            System.out.println(letter);
        }
        
        for (int i = 48 ; i <= 57; i++) {
            char letter = (char)i;
            System.out.println(letter);
        }
	}

}
