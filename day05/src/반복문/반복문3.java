package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
		// 시작값: 3
		// 종료값: 10
		// 3,4, ~10까지 프린트

		String stert = JOptionPane.showInputDialog("시작값");
		String end = JOptionPane.showInputDialog("종류값");

		int num = Integer.parseInt(stert);
		int num1 = Integer.parseInt(end);

		int i = num;

		while (i <= num1) { // 조건식
			System.out.println("밤먹을 시간이다" + i);
			i++; // 증감식

		}

	}

}
