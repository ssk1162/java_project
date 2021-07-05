package 배열응용;

import java.util.Iterator;
import java.util.Scanner;

public class 극장예매2 {

	public static void main(String[] args) {

		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (true) {
			System.out.println("--------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			System.out.println("원하시는 좌석번호를 입력>> (종료는 -1)");
			int n = sc.nextInt();

			if (n == -1) {
				System.out.println("예약 시스템을 종료");
				break;
			}
			if (a[n] != 1) {
				a[n] = 1;
				System.out.println("예약 완료");
				sum++;
				System.out.println("예매 총 갯수" + sum);

			} else {
				System.out.println("이미 예약된 자리입니다");
			}
		}
		sc.close();

		// 예약처리하기 전에 이미 그 자리가 예약된 자리인지 확인
		// 확인 방법을 정해봅시다
		// 0번을 입력했으면 배열의 인덱스 0번자리를 1로 변경해서 예약되었다라는 것을 저장해두자
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				count++;
			}
		}
		System.out.println(count);

		// 지금까지 배열에 저장된 값 들중 1이 몇개인지 세어보세요
	}
}
