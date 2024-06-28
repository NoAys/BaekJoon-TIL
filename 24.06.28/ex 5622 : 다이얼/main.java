import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int count = 0;
		int value;
		
		int b = a.length();
		
		for (int i = 0; i < b; i++) {
			
			value = a.charAt(i);
			
			if(value < 68) {
				count += 3;
			} else if (value < 71) {
				count += 4;
			} else if (value < 74) {
				count += 5;
			} else if (value < 77) {
				count += 6;
			} else if (value < 80) {
				count += 7;
			} else if (value < 84) {
				count += 8;
			} else if (value < 87) {
				count += 9;
			} else {
				count += 10;
			}
		}
		System.out.println(count);
	}
}
