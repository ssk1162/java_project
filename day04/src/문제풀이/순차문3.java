package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {

		/*
		 * 숫자1입력 : 333
		 * 숫자2입력 : 222
		 * 두 숫자를 정수로 변환해서 더하기의 결과 출력 빼기의 결과 출력
		 */

		String num = JOptionPane.showInputDialog("숫자 1입력");
		String num1 = JOptionPane.showInputDialog("숫자 2입력");

		int sum = Integer.parseInt(num);
		int sum1 = Integer.parseInt(num1);

		int result = sum + sum1;
		int result1 = sum - sum1;

		System.out.println("더하기의 결과 " + result);
		System.out.println("빼기의 결과 " + result1);
	}

}
