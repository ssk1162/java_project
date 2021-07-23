package 생성자;

public class 마스크 {

		// 속성 => 멤버변수
		// 색, 가격
		// 자동 초기화
		String color; // 참조형변수는 null
		int price; // 기본형변수는 0
		// 객체생성시 클래스이름과 동일한 것이 있으면 자동 호출
		// 객체생성시 넣어주어야 하는 처음값을 넣어주기위해서 사용
		// 생성자메서드 => 생성자
		public 마스크(String c, int p) {
			color = c;
			price = p;
		}
		
		// 동작 => 멤버메서드
		public void cover() {
			System.out.println("마스크 쓰다");
		}
		
		public String toString() {
			return color + " " + price;
		}
	}
