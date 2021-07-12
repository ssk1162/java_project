package 클래스사용;

import 클래스생성.에어컨;

public class 거실에 {

	public static void main(String[] args) {
		
		에어컨 a = new 에어컨();
		
		a.from = "삼성";
		a.onOff = true;
		a.temp = 20;
		a.wind = "회전";

		a.에어컨켜다();
		a.에어컨끄다();
		System.out.println("에어컨 구입한곳 " + a.from);
		System.out.println("에어컨 전원은 " + a.onOff);
		System.out.println("에어컨 온도는 " + a.temp + "도");
		System.out.println("에어컨 바람 방향은 " + a.wind);

		
	}

}
