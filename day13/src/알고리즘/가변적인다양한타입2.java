package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입2 {

	public static void main(String[] args) {
		
		//1 동계 올림픽 피겨 순위
		// 1위 : 김연아
		// 2위 : 김영아
		// 3위 : 김양아
		// 4위 : 김용아
		// 4위가 반칙을 하여 탈락함
		// 전체 명단을 다시 프린트
		
		ArrayList a = new ArrayList();
		
		a.add("김연아");
		a.add("김영아");
		a.add("김양아");
		a.add("김용아");
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(i + 1 + "위: " + a.get(i));
		}
		System.out.println();
		for (int i = 3; i < a.size(); i++) {
			System.out.println(i + 1 + "위: " + a.get(i) + "가 반칙을 하여 탈락함");
		}
		System.out.println();
		a.remove(3);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(i + 1 + "위: " + a.get(i));
		}
		System.out.println();
		//2 아침에 가방에 넣은 물건들 가방이 무거워지면 안되니까
		//	하나씩만 넣으려고 함
		//	내 가방은 같은 물건이 하나이상 들어가지 않음
		//	실제로 내가 넣은 것: 휴지, 휴대폰, 볼펜, 휴지
		//	내 가방에 들어간 물건의 개수와 물건들을 쓰시오
		
		HashSet b = new HashSet();
		
		b.add("휴지");
		b.add("휴대폰");
		b.add("볼펜");
		b.add("휴지");
		
		System.out.println("내 물건에 들어간 물건 개수: " + b.size());
		System.out.println(b);
		
		
		
		
	}

}
