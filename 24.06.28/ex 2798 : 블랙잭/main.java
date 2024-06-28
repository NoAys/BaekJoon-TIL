import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

    // arr, N, M을 변수에 넣고 search를 실행
		int result = search(arr, N, M);
		System.out.println(result);
		
	}
	
	static int search(int[] arr, int N, int M) {
		int result = 0;

    // N의 최소값이 3이고 3장을 고르는 것이므로 첫번째 카드는 N - 2까지만 순회
		for (int i = 0; i < N - 2; i++) {
      // 두번째 카드는 첫번째 카드의 다음 카드 부터 N - 1까지만 순회
			for (int j = i + 1; j < N - 1; j++) {
        // 세번째 카드는 두번째 카드의 다음 카드부터 N 까지만 순회
				for (int k = j + 1; k < N; k++) {
          // 카드를 전부더해 sum에 집어넣고
					int sum = arr[i] + arr[j] + arr[k];
					// M과 sum이 일치하면 sum을 return
					if (M == sum) {
						return sum;
					}
					// result보다 sum이 크고 sum이 M보다 작으면 기존 result 값을 현재 sum 값을 갱신
					if (result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}
		
		return result;
	}
}
