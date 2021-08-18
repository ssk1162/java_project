package 누적변수;

// java.util.a.Test;
// import java.util.*; 하위메뉴 쓸려면 다시 지정 / java.util.a.*;

import java.util.Scanner;

public class 콘솔입력스캐너4 {

	public static void main(String[] args) {

		Scanner n1 = new Scanner(System.in);
		
		System.out.print("안정성 점수(30%): ");
		double a = n1.nextDouble() * 0.3;
		System.out.println(a);

		System.out.print("속도 점수(50%): ");
		double a1 = n1.nextDouble() * 0.5;
		System.out.println(a1);

		System.out.print("안정성 점수(20%): ");
		double a2 = n1.nextDouble() * 0.2;
		System.out.println(a2);

		double sum = a + a1 + a2;
		
		System.out.println("---------------------------------");
		
		if (sum >= 90) {
			System.out.println(sum + " 최우수");
		} else if (sum >= 80) {
			System.out.println(sum + " 우수");

		} else if (sum >= 70) {
			System.out.println(sum + " 보통");

		} else {
			System.out.println(sum + " 미달");

		}
	}

}
