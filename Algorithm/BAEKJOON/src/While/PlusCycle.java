package While;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, tmp;
		int count = 0;
		
		N = sc.nextInt();
		sc.close();
		
		tmp = N;
		
		do {
			tmp = tmp % 10 * 10 + (tmp/10 + tmp%10) % 10;
			count++;
		} while(N != tmp);
		
		System.out.println(count);
	}

}
