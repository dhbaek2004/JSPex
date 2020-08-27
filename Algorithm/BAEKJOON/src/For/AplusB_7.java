package For;

import java.util.Scanner;

public class AplusB_7 {

	public static void main(String[] args) {
		
		int T, A, B;
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			if(A>0 && B<10) {
				System.out.println("Case #" + i + ":" + (A + B));	
			}
			
		}
		
		sc.close();
		
	}

}
