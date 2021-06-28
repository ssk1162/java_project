package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {
		/*
		 * 사각형의 넓이를 구하자
		 * 가로크기: 33.3
		 * 세로크기: 22.2
		 * 사각형의 넓이는 ===입니다
		 */
		String ga = JOptionPane.showInputDialog("가로크기");
		String se = JOptionPane.showInputDialog("세로크기");
		
		double ga1 = Double.parseDouble(ga);
		double se1 = Double.parseDouble(se);
		
		double result = ga1 * se1;
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}
