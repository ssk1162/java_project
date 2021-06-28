package 복습.순차문;

import java.awt.PrintGraphics;

import javax.swing.JOptionPane;

public class 입력처리출력 {
	// main + 컨트로 + 스페이스바
	public static void main(String[] args) {
		// 1 입력
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제하시나요?");
		String time = JOptionPane.showInputDialog("몇시간이나 하셨나요?");

		// 2 처리
		String result = when + "에 " + hobby + "을 하시는군요";
		// String => int로 처리
		int time1 = Integer.parseInt(time);

		if (time1 >= 3) { // 비교연산자의 결과는 항상 boolean(논리데이터, true/false)
			JOptionPane.showMessageDialog(null, "아주 많이 하셨군요"); // 조건이 true일때 실행
		} else {
			JOptionPane.showMessageDialog(null, "보통으로 하셨군요"); // 조건이 false일때 실행

		}

		// 3 출력
		JOptionPane.showMessageDialog(null, result);

	}

}
