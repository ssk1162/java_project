package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {

		while (true) { // 무한루프
			System.out.println("계속돈다");
			String q = JOptionPane.showInputDialog("중단하십니까? x");
			if (q.equals("x")) {
				//break;
				System.exit(0); //뭐가됬든 그만
			}
		}

	}

}
