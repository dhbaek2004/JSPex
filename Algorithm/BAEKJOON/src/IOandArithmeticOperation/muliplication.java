package IOandArithmeticOperation;

import java.util.Scanner;

// �̰� ���ڲ� Ʋ������ �𸣰���.

public class muliplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		//System.out.println("�� ���� ���ڸ� �ڿ����� �Է��Ͻʽÿ�.");
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println("(3) : " + (B % 100 % 10 * A));
		System.out.println("(4) : " + (B % 100 / 10 * A));
		System.out.println("(5) : " + (B % 100 * A));
		System.out.println("(6) : " + (A * B));
		
	}

}
