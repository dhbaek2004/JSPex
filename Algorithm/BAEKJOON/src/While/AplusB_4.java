package While;

import java.util.Scanner;

public class AplusB_4 {

	public static void main(String[] args) {
		
		int A, B;
		
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
		}
			
	}
}