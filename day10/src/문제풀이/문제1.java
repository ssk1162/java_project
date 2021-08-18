package 문제풀이;

import java.util.Iterator;
import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// 참고 사과,바나나는 2000원씩 포도,키위는 3000원씩
		// =========================
		// 좋아하는 과일은? 0)사과 1)바나나 2)포도 3)키위 0)종료>> 1
		// =========================
		// 사과가 선택되었습니다

		// =========================
		// 좋아하는 과일은? 0)사과 1)바나나 2)포도 3)키위 0)종료>> 2
		// =========================
		// 바나가 선택되었습니다

		// =========================
		// 좋아하는 과일은? 0)사과 1)바나나 2)포도 3)키위 0)종료>> 0
		// =========================
		// 시스템이 종료됩니다

		// 사과 : 3개
		// 바나 : 2개
		// 포도 : 1개
		// 키위 : 2개
		// 구매하려면 전체 금액은 ____ 입니다

		int[] a = new int[4];
		String[] b = { "사과", "바나나", "포도", "키위" };
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("======================");
			System.out.println("좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> ");
			System.out.println("======================");
			int c = sc.nextInt();
			if (c == 0) {
				System.out.println("시스템을 종료합니다");
				for (int i = 0; i < b.length; i++) {
					System.out.println(b[i] + ": " + a[i]);
				}
				int sum = ((a[0] + a[1]) * 2000) + ((a[2] + a[3]) * 3000);
				System.out.println("총 가격 : " + sum);
				break;
			}
			a[c - 1]++;
			System.out.println(b[c - 1] + " 선택하셨습니다");
		}
		sc.close();

	}

}
