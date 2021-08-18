package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {
		/*
		 * 랜덤한 숫자를 2개 발생시켜서 
		 * 첫번째 랜덤한 숫자가 더 크면 첫번재가 더 커요 
		 * 두번째 더 크면 두번재가 더 커요
		 */

		Random a = new Random();
		int num = a.nextInt(100);
		int num1 = a.nextInt(100);

		if (num > num1) {
			System.out.println("첫번째가 더 커요");
		} else {
			System.out.println("두번째가 더 커요");

		}

		/*
		 * 게임을 계속하시겠습니까? (0:계속, 1:종료)
		 *	무한루프 사용
		 *	첫번째 사람 숫자를 입력 20
		 *	두번째 사람 숫자를 입력 10 
		 *	첫번째 사람 승
		 *	더큰 숫자를 낸 사람이 승리 종료이면 게임을 stop
		 */
		while (true) {
			//게임을 계속할지 종료할지 선택
			String q = JOptionPane.showInputDialog("계속하십니까? (계속 0, 종료 1)");
			//String을 정수로 변환
			int dum = Integer.parseInt(q);
			//1을 입력한 경우 종료
			if (dum == 1) {
				JOptionPane.showMessageDialog(null, "게임을 종료 합니까?");
				System.out.println("게임 stop");
				break;
				// System.exit(0);
				//0을 입력하면 계속
			} else {
				JOptionPane.showMessageDialog(null, "게임을 계속 합니까?");
				// 게임 구현해주세요
				//첫번째 사람의 숫자를 입력
				String b = JOptionPane.showInputDialog("첫번째 사람 숫자");
				//두번째 사람의 숫자를 입력
				String c = JOptionPane.showInputDialog("두번째 사람 숫자");
				//첫번째, 두번째 숫자를 입력하기 위해 정수로 변환
				int num2 = Integer.parseInt(b);
				int num3 = Integer.parseInt(c);
				
				if (num2 > num3) { // 첫번째 사람이 두번재 사람보다 큰지
					JOptionPane.showMessageDialog(null, "첫번째 승");
					System.out.println("첫번째 사람 승");
				
				} else if (num2 < num3) { // 두번재 사람이 첫번째 사람보다 큰지
					JOptionPane.showMessageDialog(null, "두번째 승");
					System.out.println("두번째 사람 승");

				} else { // 비겼을 경우
					JOptionPane.showMessageDialog(null, "무승부");
					System.out.println("무승부");
					
				}

			}

		}

	}

}
