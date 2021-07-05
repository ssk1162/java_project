package 배열응용;

import java.util.Iterator;
import java.util.Scanner;

public class 극장예매 {

	public static void main(String[] args) {
		int[] seat = new int[10]; // seat 
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		final int MONEY = 10000;

		while (true) {
			System.out.println("--------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " "); // 0부터 9까지 값을 나타냄
			}

			System.out.println();
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " "); // seat 인덱스 {0,0,0,0,0,0,....} 10개 나타냄
			}
			System.out.println();
			System.out.println("원하시는 좌석번호를 입력하세요 (종료는 -1) : ");
			int no = sc.nextInt(); // 스캐너 번호 입력해서 변수 no에 넣음

			if (no == -1) { // 입력한 수가 -1인 경우 종료
				System.out.println("예약 시스템을 종료합니다");
				int total = sum * MONEY; // 누적계수 * money 10000 = 총 가격
				System.out.println("당신의 지불금액은 : " + total);
				break;
			}

			if (seat[no] != 1) { // 1 들어가지 않은경우 예약 완료
				seat[no] = 1; // 1이 들어갈 경우 예약된 자리
				System.out.println(no + "번 예약 완료");
				sum++; // 총 예약된 갯수
				System.out.println(sum);
			} else {
				System.out.println("이미 예약된 자리입니다");
				System.out.println("다른 자리를 선택해주세요");
			}
			System.out.println();
		}
		sc.close(); // 스캐너 종료

		int sum2 = 0; // 

		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				sum2++;
			}
		}
		System.out.println(sum2 + " 예약된 자리");

		String sum3 = "";

		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				sum3 += i + "번 ";
			}
		}
		System.out.println(" 예약된 자리 목록" + sum3);
	}

}
