package 메서드반환값;

public class 계산기 {

	// 성질: 멤버변수
	// 동작: 메버메서드(*)
	// cal.add(100,200)
	// 기능정의, 함수정의, 메서드 정의
	// x, y는 지역변수, add안에서만 사용 가능
	// 메서드 사용9호출, call, )
	// 메서드 안에ㅓ 값을 전달할 목적으로 생성되는 변수
	// 매개변수, 파라메터 parameter
	// void: 없다라는 의미, 반환값이 없다, 리턴하고 같이 쓸수 없다
	
	
	public int add(int x, int y) {
		int result  = x + y;
		System.out.println("두수의 합은 " + result);
		return result;
		
	}
}
