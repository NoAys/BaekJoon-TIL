import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for (int q = 0; q < T; q++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int count = 0;
			int room = 0;
			
			for (int i = 1; i <= b; i++) {
				for (int j = 1; j <= a; j++) {
					room = 100*j + i;
					count++;
					if (count == c) {
						System.out.println(room);
					}
				}
			}
		}
	}
}
