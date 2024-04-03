package assignments.week1;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		int input=121;
		int output=0;

		for(int i=input;i>0; i/=10) {
			int rem=i%10;
		
			output=(output*10)+rem;
			
		}
			if(input==output) {
			System.out.println("is a palindrome");
			}
			else {
				System.out.println("is not a palindrome");
			}		
	}
	
}
