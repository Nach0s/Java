import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = 0, b = 1, f = 0, n;		
		System.out.print("Enter integer [0;30]: ");
		if(sc.hasNextInt()) {
			n = sc.nextInt();
			if ((n < 0) || (n > 30)) {
				System.out.println("Range error");
				return;
			}
			for(int i=0; i<n; i++) {
				f = a + b;
				b = a;
				a = f;
			}	
			System.out.print("Result: ");			
			System.out.println(f);
		} else {
			System.out.println("Input error");
		}
	}
}
