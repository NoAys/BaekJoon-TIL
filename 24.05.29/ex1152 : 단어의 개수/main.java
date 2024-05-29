import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s," ");
		// 문자열 s를 공백을 기준으로 나눠서 토큰에 저장
		
		System.out.println(st.countTokens());
		// 저장되어있는 토큰의 갯수를 출력
	}

}
