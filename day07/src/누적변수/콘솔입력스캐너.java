package 누적변수;

// java.util.a.Test;
// import java.util.*; 하위메뉴 쓸려면 다시 지정 / java.util.a.*;

import java.util.Scanner;

public class 콘솔입력스캐너 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next(); // String 입력 / 단어 단위로 구분 공백이있으면 무시함
		System.out.println("당신의 이름은? " + name);
		
		System.out.print("당신의 소속은?: ");
		String name1 = sc.next();
		System.out.println(name1 + " 소속이군요");
	}

}
