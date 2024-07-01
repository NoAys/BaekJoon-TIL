import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		System.out.println(fibonacci(N));
	}

	static int fibonacci(int N) {
    // 배열안에 미리 값을 넣어놓고 출력
		int[] arr = new int[46];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		return arr[N];
	}

}
