import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
        for(int i = 1; i <= a; i++){
        	// 한 줄에 *은 i만큼 있고, 공백은ㄴ a-i만큼 있다.
        	for (int j = 1; j <= a-i; j++) {
        		System.out.print(" ");;
        	}
        	for (int k = 1; k <= i; k++) {
        		System.out.print("*"); 		
        	}
        	System.out.println();
        }
	}
}
