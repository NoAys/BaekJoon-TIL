import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int n = 0;
		
		for (int i = 0; i < M; i++) {
			n += months[i];
		}
		n += D - 1;
		System.out.print(days[n%7]);
	}
}
