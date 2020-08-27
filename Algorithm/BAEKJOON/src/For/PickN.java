package For;

import java.util.Scanner;

public class PickN {

	public static void main(String[] args) {
		
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}

}
