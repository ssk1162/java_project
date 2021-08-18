package 클래스생성;

public class 계산기 {
	public void order(String food) {
		System.out.println("당신이 주문한것은 " + food + "입니다");
	}
	// 사칙연산 계산기
	public void 더하기(int pu, int ma) {
		System.out.println("더하기");
		int result1 = pu + ma;
		System.out.println("두 수의 합은 " + result1);
	}
	public void 빼기() {
		System.out.println("빼기");
	}
	public void 곱하기(int price, int count) {
		System.out.println("곱하기");
		int result = price * count;
		System.out.println("두 수의 곱은 " + result);
	}
	public void 나누기(double na, double na1) {
		System.out.println("나누기");
		double result2 = na / na1;
		System.out.println("두 수의 나누기는 " + result2);
	}
}
