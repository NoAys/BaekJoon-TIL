import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		
		
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		for (int i = 2; i <= N; i++) {
			int num = arr[i];
			if (num == 0) {
				list.add(i);
			}
			if (num >= 1) {
				list.add(list.size() - num, i);
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
