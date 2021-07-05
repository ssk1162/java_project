package 문제풀이;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {

		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자 입력>>");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);
		sc.close(); // 스트림(연결통로)를 닫아라
	}
		

}
