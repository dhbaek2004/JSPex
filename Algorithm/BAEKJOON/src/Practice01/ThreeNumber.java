package Practice01;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumber {
// �־��� �� ���� A B C �� �ι�°�� ū ���� ���

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[3];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(nums);
		System.out.println(nums[1]);
		
	}

}
