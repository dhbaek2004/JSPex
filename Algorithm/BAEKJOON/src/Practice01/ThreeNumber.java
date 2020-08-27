package Practice01;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumber {
// 주어진 세 정수 A B C 중 두번째로 큰 수를 출력

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
