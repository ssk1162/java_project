package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		// 1 입력
		int jumsu = 77;
		
		// 2 처리: 학점 부여
		String result = null; //변수의 초기화!
		
		if (jumsu >= 90) {
			result = "A";
		} else if (jumsu >= 80) {
			result = "B";
		} else if (jumsu >= 70) {
			result = "C";
		} else {
			result = "D";
		}
		
		
		// 3 출력
		System.out.println(result);
		
	}

}
