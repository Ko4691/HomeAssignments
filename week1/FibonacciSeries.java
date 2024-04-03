package assignments.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int c,n=8;
		int a=0, b=1;
		System.out.println(a+ "\n" +b);
		for (int i = 1; i <=n; i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
}
