package For;

import java.util.Scanner;

public class NineNineDan {

	public static void main(String[] args) {
		
		System.out.println("������ ��� �� : 2���� 9 ������ ������ �Է��ϼ���.");
		int N;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
	}

}
