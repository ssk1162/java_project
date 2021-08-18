package 자바기본;

public class 데이터타입 {

	public static void main(String[] args) {
		
		// 기본데이터 타입: 정수, 실수, 문자, 논리=값
		// 참조데이터 타입: 나머지 다, 배열, 클래스=주소,...
		// 정수데이터 타입
		byte b = 100; // ~128~127, 1byte, 8bit의 모음
		// bit(비트) : 신호 하나, 1/0
		// @ : 0,1 (2개)
		// @@ : 00, 01, 10, 11 (4개)
		// @@@ : 000, 001, ...(8개)
		// @@@@@@@@ : (256개) -128~127
		short s = 30000; // 2byte +-3만
		int i = 100000000; // 4byte +-21억
		long l = 2200000000L; // 8byte // 220000000L;
		
		double d = 4.456789123456; // 8byte
		float f = 1.234567F; // 1.234567f
		
		char c = 'A'; // 2byte
		System.out.println(c + 1);
		
		boolean bo = true; // false; // 1byte
		
	}

}
