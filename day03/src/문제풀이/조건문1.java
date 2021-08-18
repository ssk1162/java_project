package 문제풀이;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {
		/*
		 * 조건문2
		 * int x = 111;
		 * int y = 222;
		 * x > y면 x가 더커요
		 * 그게 아니면 y가 더커요
		 */

		int x = 111;
		int y = 222;

		if (x > y) {
			JOptionPane.showMessageDialog(null, "x가 더커요");
		} else {
			JOptionPane.showMessageDialog(null, "y가 더커요");

		}

	}

}
