package 자바기본;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// 오늘 날씨는 어떤가요
		// 변수에 넣어서 비가 올거같으면 우산 가져가기 1
		// 안올거 같으면 그냥 나가기 2
		Scanner sc1 = new Scanner(System.in);

		for (int i = 0; i < 2; i++) { // 2번 비교

			System.out.print("오늘 날씨는 ");
			sc1 = new Scanner(System.in);

			int a = sc1.nextInt(); // 오늘 날씨 int값으로 저장

			if (a == 1) { // 오늘 날씨가 1일때 비가 옴
				System.out.println("우산 가지고 나가자");
			} else {
				System.out.println("그냥 나가자");
			}
		}
		sc1.close();
	}

}
