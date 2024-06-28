import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int N = 0;
		int M = 0;
		
		while (A != 0) {
			N = N * 10 + A % 10;
			A /= 10;
		}
		
		while (B != 0) {
			M = M * 10 + B % 10;
			B /= 10;
		}
		
		System.out.println(Math.max(N, M));
	}
}
