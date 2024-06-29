import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sell = 0;
		int cnt = 0;
		
		if (B >= C) {
			System.out.println("-1");
		} else {
			while (B < C) {
				sell += C - B;
				cnt++;
				
				if (A < sell) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}
