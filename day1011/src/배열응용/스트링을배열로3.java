package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링을배열로3 {

	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		System.out.println("전화번호입력 >>");
		String a = r.next();
		
		String b = a.trim();
		
		System.out.println(b);

		String[] b1 = b.split("-");
		
		
		for (int i = 0; i < b1.length; i++) {
			if (b1[0].equals("011")) {
				System.out.println("SK 입니다");
			} else if (b1[0].equals("019")) {
				System.out.println("LG 입니다");
			} else {
				System.out.println("Apple 입니다");
			}
			break;
		}
		for (int i = 0; i < b1.length; i++) {
			if (b1[1].length() == 4) {
				System.out.println("최신폰");
			} else {
				System.out.println("올드폰");
				
			}
			break;
		}
			if (b.length() -2 >= 10) {
				System.out.println("유효한 전화번호");
			} else {
				
			System.out.println("유효하지 않은 전화번호");
		}
	}
}


