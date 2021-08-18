package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤2개 {

	public static void main(String[] args) {
		//int x;
		//Random r;
		Random r = new Random(); // 램에 랜덤을 복사 / random 부품 클레스
		int n1 = r.nextInt(100); // 0~99까지 정수 중 하나를 n1에 대입
		int n2 = r.nextInt(100); // 0~99까지 정수 중 하나를 n2에 대입
		System.out.println(n1); // 0~99까지 정수 중 n1에 대입된걸 출력
		System.out.println(n2); // 0~99까지 정수 중 n2에 대입된걸 출력

		if (n1 > n2) { // n1은 n2보다 큰가?
			JOptionPane.showMessageDialog(null, "n1이 더 큼"); // n1이 n2보다 큼
			
		}
		if (n1 < n2) { // n2은 n1보다 작은가?
			JOptionPane.showMessageDialog(null, "n2이 더 큼"); // n2이 n1보다 큼

		}

	}

}
