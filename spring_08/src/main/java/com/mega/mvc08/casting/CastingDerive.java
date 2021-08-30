package com.mega.mvc08.casting;

import com.mega.mvc08.box.BallPen;
import com.mega.mvc08.box.볼펜Main;

public class CastingDerive {

	public static void main(String[] args) {
		
		// 파생된 데이터 참조형 변수
		// 형변환(casting 캐스팅)
		// 참조형 형변환은 "상속관계에 있는 클래스간" 가능 
		볼펜Main p = new 볼펜Main(); // 부모, 수퍼클래스, 큰
		BallPen b = new BallPen(); // 자식, 서브클래스, 작
		// 클래스간의 크기는 "개념"을 가지고 큰지/작은지를 판별
		
		p = b; // 큰 <--자동형변환-- 작
		b = (BallPen)p; // 작 <--강제형변환-- 큰
		
	}

}
