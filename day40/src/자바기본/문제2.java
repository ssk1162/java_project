package 자바기본;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// 시험 점수를 입력받고
		// 90이상은 와우, 80이상은 오우, 70이상은 흠, 60이상은 음..., 나머지는 나락
		// 5과목 평균을 구하고 입력받는 값을 출력

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int[] jumsu = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < 5; i++) {

			System.out.print("시험 점수는? ");
			int a = sc.nextInt();
			if (a >= 90) {
				System.out.println("와우");
			} else if (a >= 80) {
				System.out.println("오우");
			} else if (a >= 70) {
				System.out.println("흠");
			} else if (a >= 60) {
				System.out.println("음...");
			} else {
				System.out.println("나락");
			}

			jumsu[i] = a;
			sum += a;
		}
		double avg = sum / 5.0;
		System.out.println("평균은 " + avg);
		System.out.println("------------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		sc.close();
	}

}
