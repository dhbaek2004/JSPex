package While;

import java.util.Scanner;

public class AplusB_5 {

	public static void main(String[] args) {
		
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			if(A == 0 && B == 0)
				break;
			System.out.println(A + B);
		}
			
		sc.close();
	}
}