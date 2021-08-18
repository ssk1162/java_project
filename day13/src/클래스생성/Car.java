package 클래스생성;

public class Car {
	
	// 전역변수(global, 글로벌 변수)
	// 성질 -> 변수로 만든다 멤버변수
	// 색(color), 바퀴수(count)
	public String color; // 자동초기화 null
	public int count; // 자동초기화 0
	
	// 동작 -> 멤버메서드
	public void run() { // 메서드
		// 함수의 기능을 정의
		System.out.println("네바퀴로 달리기");
		
	}
	
	public void up() {
		System.out.println("속도를 20씩 빨라진다");
		
	}
	
}
