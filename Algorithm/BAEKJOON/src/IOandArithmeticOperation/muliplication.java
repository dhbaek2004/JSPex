package IOandArithmeticOperation;

import java.util.Scanner;

// 이거 왜자꾸 틀리는지 모르겠음.

public class muliplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		//System.out.println("두 개의 세자리 자연수를 입력하십시오.");
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println("(3) : " + (B % 100 % 10 * A));
		System.out.println("(4) : " + (B % 100 / 10 * A));
		System.out.println("(5) : " + (B % 100 * A));
		System.out.println("(6) : " + (A * B));
		
	}

}
