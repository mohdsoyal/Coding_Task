package CodingTest;

public class CodingTest {
	
	public static void main(String[] args) {
		
		String input = "Hello world";
		int count = 0;
		
		
		input = input.toLowerCase();
		
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			
			if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				count++;
			}
		}
		
		System.out.println("Number of consonants: " + count);
	}
}
