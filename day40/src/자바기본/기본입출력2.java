package 자바기본;

import java.util.Scanner;

public class 기본입출력2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//int sum; // 쓰레기값 상태 : 연산도 할 수없고 출력도 안되는 상태
		int sum = 0; // 쓰레기값 대신 처음값을 넣어주는 것, 초기화, 변수초기화
		// 변수초기화를 반드시 해주어야 하는 경우는?
		// 변수초기화는 반드시 해주어야 한다
		// 자동으로 되는 경우가 있음 (전역변수, 멤버변수는 자동 초기화됨)
		// 전역변수는 클래스 전체영역에서 사용가능한 변수
		// 변수 선언의 위치에 따라 사용할 수 있는 범위가 달라짐
		// 변수 선언이 클래스 바로 아래되어야 전체 영역에서 사용 가능
		// 자동으로 안되는 경우는 수동으로 초기화를 해주어야 한다 (지역변수, 로컬변수)
		// 로컬변수는 반드시 수동으로 초기화를 해주어야한다
		for (int i = 0; i < 5; i++) {
			
			System.out.print("오늘 온도는? ");
			int a = sc.nextInt(); // 모든 외부 입력은 모두다 String --> int로 변환 "33" >> 33
			if (a >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜츈!");
			}
			sum = sum + a;
		}
		double avg = sum / 5.0; // 자바에서는 정수끼리의 연산은 무조건 정수
		System.out.println(avg);
		//double avg = (double)sum / 5;
		// (바꾸고 싶은 타입)cpu가 ram에 있는 것을 가져다가 타입변경
		// 자바에서는 하나라도 실수이면, 연산의 결과는 무조건 실수
		sc.close(); // 입력스트림 닫는다
	}
}
