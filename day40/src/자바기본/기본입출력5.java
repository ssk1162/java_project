package 자바기본;

import java.util.Scanner;

public class 기본입출력5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] jumsu = {0, 0, 0, 0, 0};
		// int[] jumsu = new int[5]; // 배열은 자동 초기화
		// 횟수를 정하고 반복하고자 하는 경우에는 카운트초기값, 반복할 조건, 증가값
		int i2 = 0; // 카운트초기값
		while (i2 < 5) { // 반복할 조건
			
			System.out.print("오늘 온도는? ");
			int a = sc.nextInt();
			if (a >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜츈!");
			}
			jumsu[i2] = a;
			sum += a;
			i2++; // 증가값
			
		}
		double avg = sum / 5.0;
		System.out.println(avg);
		System.out.println("------------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		sc.close();
	}
}
