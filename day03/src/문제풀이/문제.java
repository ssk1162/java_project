package 문제풀이;

import javax.swing.JOptionPane;

public class 문제 {

	public static void main(String[] args) {
		
		// 1번 문제
		int count = 5;
		int cafe = 5000;
		int sum = count * cafe;
		
		if (sum > 20000) {
			JOptionPane.showMessageDialog(null, "할인해드릴게요");
			System.out.println("할인해드릴게요");
		} else {
			JOptionPane.showMessageDialog(null, "총 커피값을 내세요");
			System.out.println("총 커피값을 내세요");
		}
		
		// 2번 문제
		int old = 100;
		
		JOptionPane.showMessageDialog(null, old + 1);
		
		if (old > 100) {
			System.out.println("이제부터 시작");
		} else {
			System.out.println("아직 젊어요");

		}
		
		// 3번 문제
		int wo = 1000;
		int count1 = 2;
		int ma = 2000;
		int count2 = 3;
		
		int sum1 = wo * count1;
		int sum2 = ma * count2;
		int sum3 = sum1 + sum2;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		// 4번 문제
		for (int i = 0; i < 1000; i++) {
			System.out.println("나는 짱");
		}
		
		// 5번 문제
		int kok = 75;
		int so = 50;
		int sum4 = kok + so;
		double sum5 = sum4 / 2;
		System.out.println(sum4);
		System.out.println(sum5);
		
	}

}
