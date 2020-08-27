package For;

import java.util.Scanner;

public class InvertedPickN {

	public static void main(String[] args) {
		
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i = N; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
