package 누적변수;

// java.util.a.Test;
// import java.util.*; 하위메뉴 쓸려면 다시 지정 / java.util.a.*;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력: ");
		int n1 = sc.nextInt();
		
		System.out.print("숫자2 입력: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("앞 숫자가 크다");
		} else {
			System.out.println("뒤 숫자가 크다");
			
		}
		System.out.println("n1: " + n1 );
		System.out.println("n2: " + n2 );
		
		

		
	}

}
