package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기 {

	public static void main(String[] args) {

		Random r = new Random(4);
		
		int target = r.nextInt(100);
		
		while (true) {
			// 1 입력
			// 2 숫자로 변환처리
			// 3 정답인지 확인
			// 4 정답이면 프로그램 종료
			// 정답이 아니면 1로 가라

			String num = JOptionPane.showInputDialog("숫자 입력");

			int num1 = Integer.parseInt(num);

			if (num1 == target) {
				JOptionPane.showMessageDialog(null, "정답");
				// break; // while의 break
				System.exit(0);// 무조건 끝냄
			} else {
				System.out.println("틀림");

				if (num1 > target) {
					System.out.println("너무 크다");

				} else {
					System.out.println("너무 작다");

				}

			}

		} // while
			// System.out.println("게임 종료");
	}// main

}// class
