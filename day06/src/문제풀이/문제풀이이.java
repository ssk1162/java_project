package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제풀이이 {

	public static void main(String[] args) {
		// 1 사원번호 입력 : 기103
		//	사원번호 중 첫글자가 '기'인 경우 '기획부이군요'
		//					'인'인 경우 '인사부이군요'
		//					'개'인 경우 '개발부이군요'
		// 사원번호 중 두번째 글자가 '1' 또는 '2'인 경우 '임원'
		//						'3'인 경우 '부장'
		//						'4'또는 '5'인 경우 '평사원'
		//						나머지 '해당 직급이 없음'
		
		String a = JOptionPane.showInputDialog("사원번호 입력");
		
		char mun = a.charAt(0);
		char mun1 = a.charAt(1);
		
		switch (mun) {
		case '기':
			System.out.println("기획부이군요");
			break;
		case '인':
			System.out.println("인사부이군요");
			break;
		default:
			System.out.println("개발부이군요");
			break;
		}
		
		if (mun1 == '1' || mun1 == '2') {
			System.out.println("임원");
		} else if (mun1 == '3'){
			System.out.println("부장");
		} else if (mun1 == '4' || mun1 == '5'){
			System.out.println("회사원");
		} else {
			System.out.println("해당 직급이 없음");
		}
		
		
		
		// 2 나이를 입력: 2
		//	태어난 연도는 2020년(Date이용)
		//	태어난 시각: 10
		//	오전에 태어나셨군요(오전, 오후, 밤, 새벽,...)
		
		//자동import 컨트롤 + 쉬프트 + o, f2
		Date date = new Date();
		String b = JOptionPane.showInputDialog("나이를 입력");
		String c = JOptionPane.showInputDialog("태어난 시각은?");
		
		int d = Integer.parseInt(b);
		int e = Integer.parseInt(c);
		
		int day = date.getYear() + 1901;
		
		int result = day - d;
		
		System.out.println("태어난 연도는 " + result + "년");
		
		if (e > 6) {
			System.out.println("오전에 태어났군요");
		} else if (e > 13){
			System.out.println("오후에 태어났군요");
		} else if (e < 24){
			System.out.println("밤에 태어났군요");
		} else {
			System.out.println("새벽에 태어났군요");
		}
		
		
	}

}
