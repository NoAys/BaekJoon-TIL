import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		String str = "";

    // arr의 순서가 1씩 늘어나면 ascending, 1씩 감소하면 descending, 둘다 아니면 mixed
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i + 1] - 1) {
				str = "ascending";
			} else if (arr[i] == arr[i + 1] + 1) {
				str = "descending";
			} else {
				str = "mixed";
				break;
			}
		}
		System.out.println(str);
		
	}

}
