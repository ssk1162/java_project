package 자바기본;

import java.util.Random;
import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
//		1. 4명의 나이를 입력 받으세요.
//		2. 20대는 화이자, 30대는 얀센, 40대는 AZ, 나머지 연령대는 모더나. 해당 나이에 맞는 백신 출력
//		3. 입력 받은 나이의 평균을 구하세요
		Scanner s = new Scanner(System.in);

		int sum = 0;
		int[] age = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("나이를 입력하세요 ");
			int age2 = s.nextInt();
			if (age2 == 20) {
				System.out.println("화이자");
			} else if (age2 == 30) {
				System.out.println("얀센");				
			} else if (age2 == 40) {
				System.out.println("AZ");				
			} else {
				System.out.println("모더나");
			}
			age[i] = age2;
			sum += age2;
		}
		double avg = (double)sum / 4;
		System.out.println(avg);
		s.close();
	}

}
