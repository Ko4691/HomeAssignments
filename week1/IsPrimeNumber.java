package assignments.week1;

public class IsPrimeNumber {

public static void main(String[] args) {
		
		int n=4;
		int count = 0;
		
	for (int i = 2; i<n; i++) {
			if (n%i==0) {
				count++;
			}
			}
			if(count==0)
			{
			System.out.println("is a Prime Number");
			}
			else 
			{
			System.out.println("is NOT a Prime Number");
			}
		
	}
}
