package If;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H;
		int M;
		
		H = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		
		
		if (M < 45) {
			H = H - 1;
			M = 60 - (45 - M);
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M-45));
		}
		
	}

}