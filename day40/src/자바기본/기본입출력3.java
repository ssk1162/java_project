package 자바기본;

import java.util.Scanner;

public class 기본입출력3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] jumsu = {0, 0, 0, 0, 0};
		//int[] jumsu = new int[5]; // 배열은 자동 초기화
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("오늘 온도는? ");
			int a = sc.nextInt();
			if (a >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜츈!");
			}
			jumsu[i] = a;
			sum = sum + a;
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
