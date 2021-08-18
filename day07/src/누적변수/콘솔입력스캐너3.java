package 누적변수;

// java.util.a.Test;
// import java.util.*; 하위메뉴 쓸려면 다시 지정 / java.util.a.*;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {

		// 나이 입력 100			nextInt
		// 내년 나이는 101세
		// 키를 입력 88.8			nextDouble
		// 내년 키는 98.8
		// 저녁을 먹었는지 읿력(true/false) >> true		nextBoolean
		// 배가 부르시겠군요!
		// 올해 목표는 >> 열심히 살자			nextLine
		// 올해 목표는 열심히 살자
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 입력(자바, c, python)");
		String date = sc.next();
		if (date.equals("자바")) {
			System.out.println("JSP 점프@@");
		} else if (date.equals("C++")) {
			System.out.println("ASP 점프@@");
		} else {
			System.out.println("python 점프@@");
		}
		
		switch (date) {
		case "자바":
			System.out.println("JSP 점프@@");
			break;
		case "C++":
			System.out.println("ASP 점프@@");
			break;
		default:
			System.out.println("python 점프@@");
			break;
		}
		
		
//		System.out.println("나이 입력: ");
//		int a1 = sc.nextInt();
//		System.out.println("내년 나이는 " + (a1 + 1));
//		
//		System.out.println("키를 입력");
//		Double a2 = sc.nextDouble();
//		System.out.println("내년 키는 " + (a2 + 10.0));
//		
//		System.out.println("저녁을 먹었는지 입력 (true/false)>>");
//		Boolean a3 = sc.nextBoolean();
//		if (a3) {
//			System.out.println("배부르시겠군요!");
//		} else {
//			System.out.println("false");			
//		}
//		
//		String a4 = sc.nextLine();
//		System.out.println("올해의 목표는 >> ");
//		String a5 = sc.nextLine();
//		System.out.println("올해의 목표는 " + a5);
		
		//	t r u e = 8바이트
		// String 4byte + t r u e = 12바이트
		
		
	}

}
