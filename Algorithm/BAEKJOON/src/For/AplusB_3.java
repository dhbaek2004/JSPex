package For;

import java.util.Scanner;

public class AplusB_3 {

	public static void main(String[] args) {
		
		int T, A, B;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			System.out.println(A + B);
		}
		
		sc.close();
		
	}

}
