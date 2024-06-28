import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cost = 1000 - N;
		int[] coin = {500, 100, 50, 10, 5, 1};
		int cnt = 0;

    // coin배열을 순회, i의 값은 coin의 값과 같
		for (int i : coin) {
			cnt += cost / i;
			cost %= i;
		}
		
		
		System.out.println(cnt);
	}
}
