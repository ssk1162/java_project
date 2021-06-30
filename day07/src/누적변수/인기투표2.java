package 누적변수;

import javax.swing.JOptionPane;

public class 인기투표2 {

	public static void main(String[] args) {
		
		int iu = 0, park = 0, you = 0, im = 0;
		
		for (int i = 0; i < 15; i++) {
			String result = JOptionPane.showInputDialog("인기투표(아이유1, 박지성2, 유재석3, 임영웅4)");
			
			switch (result) {
			case "1":
				iu++;
				break;
			case "2":
				park++;
				break;
			case "3":
				you++;
				break;
			case "4":
				im++;
				break;	
			default:
				JOptionPane.showMessageDialog(null, "1,2,3,4중 선택해주세요");
				i--;
				break;
			}
			
		}
		System.out.println("아이유: " + iu);
		System.out.println("박지성: " + park);
		System.out.println("유재석: " + you);
		System.out.println("임영웅: " + im);
	}
}
