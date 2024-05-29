import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 결과 값이 대문자로 출력이므로 편리를 위해 모두 대문자로 변환
		String str = sc.next().toUpperCase();
		
		// 알파벳은 총 26개
		int[] arr = new int[26];

		// 입력문자열 길이만큼 반복실행
		for (int i = 0; i < str.length(); i++) {
			// ex 'A'-'A' => 65-65 = 0 => arr배열 0번째 값 증가
			int num = str.charAt(i) - 'A';
			arr[num]++;
		}
		
		int max = 0;
		char answer = '?';
		
		// 알파벳 개수만큼 반복실행
		for (int i = 0; i < arr.length; i++) {
			// 중복값이 큰지 비교하며 max에 저장
			if (max < arr[i]) {
				max = arr[i];
				answer = (char)(i+'A');
			// 만약 max와 같은 값이 여러개일 경우 '?' 출력
			} else if (max == arr[i]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
	}

}
