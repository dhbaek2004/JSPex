package Practice01;

import java.util.Scanner;

public class Mcdonald {

	public static void main(String[] args) {
		int L, M, S, CO, CY;
		
		Scanner sc = new Scanner(System.in);
		
		int bgr = 2001;
		int drk = 2001; 
		
		for(int i=0; i<3; i++) {
			int min = sc.nextInt();
			if(min < bgr) {
				bgr = min;
			}
		}
		
		for(int i=0; i<2; i++) {
			int min = sc.nextInt();
			if(min < drk) {
				drk = min;
			}
		}
		
		System.out.println(bgr + drk - 50);
		
		
		
	}

}
