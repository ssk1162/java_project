package 조건문;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			// ++, -- : 증감연산자 램의 변수값을 1씩 증가/감소시켜주는 처리
			// for (int i = 0; i < 3; i = i + 1) {
			// for(초기값; 조건식; 증감식;)
			
			// 1 입력
			// 입력을 데이터로 입력받아서 처리하세요
			String a = JOptionPane.showInputDialog("당신의 점수는?");
			// String => int로 변환해서 jumsu에 넣어주면 된다
			int jumsu = Integer.parseInt(a);

			// 2 처리
			String result = null; // 선언: 램에 공간이 할당
			// 처음에 공간을 할당할 때 쓰레기갑이 들어있는 공간이 할당이 됨
			// 쓰레기값은 프린트도 안되고 연산도 불가능
			// 변수를 깨끗하게 작업을 처음에 초기에 해두는 것이 좋다
			// 변수의 초기화
			// System.out.println(result);

			if (jumsu >= 90) {
				result = "A학점";
			} else if (jumsu >= 80) {
				result = "B학점";
			} else if (jumsu >= 70) {
				result = "C학점";
			} else {
				result = "D학점";
			}

			// 3 출력
			System.out.println("당신의 학점은 " + result);

		} // for
	} // main

} // class
