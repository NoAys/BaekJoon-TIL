import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for (int i = 0; i < C; i++) {
			
			int N = sc.nextInt();
			int[] arr = new int[N];
			double sum = 0;
			
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			double avg = sum / N;
			double cnt = 0;
			
			for (int j = 0; j < N; j++) {
				if (avg < arr[j]) {
					cnt++;
				}
			}
			System.out.format("%.3f%%%n",  (cnt / N) * 100);
		}
	}
}
