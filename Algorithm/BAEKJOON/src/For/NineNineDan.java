package For;

import java.util.Scanner;

public class NineNineDan {

	public static void main(String[] args) {
		
		System.out.println("구구단 출력 앱 : 2부터 9 사이의 정수를 입력하세요.");
		int N;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
	}

}
