package Practice01;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		int[] score = new int[5];
		int n;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 5; i++) {
			n = sc.nextInt();
			if(n <= 40)
				n = 40;
			score[i] = n;
		}
		
		for(int i = 0; i < 5; i++) {
			sum = score[i] + sum;
		}
		
		System.out.println(sum/5);
	}

}
