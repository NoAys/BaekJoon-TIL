import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int d = gcd(a, b); // 최대공약수를 구한다.
			System.out.println(a * b / d); // 최소공배수를 구한다.
			
		}
	}
	
	public static int gcd(int a, int b) {
		
		while (b != 0) {
			int r = a % b; // 나머지를 구한다.

      // GCD(a, b) = GCD(b, r)이므로 변환한다.
			a = b;
			b = r;
		}
		
		return a;
	}
}
