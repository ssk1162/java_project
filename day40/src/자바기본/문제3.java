package 자바기본;

import java.util.Random;
import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int randomnum = 0;
		int usenum = 0;

		Random r = new Random();
		randomnum = r.nextInt(50) + 1;

		while (true) {
			System.out.print("1에서 50까지 숫자 입력 ");
			usenum = s.nextInt();
			
			if (randomnum > usenum) {
				System.out.println("1과 50사이의 값 중 입력한 값보다 큰 값을 입력");
			} else if (randomnum < usenum) {
				System.out.println("1과 50사이의 값 중 입력한 값보다 작은 값을 입력");
			} else {
				System.out.println("사용자의 입력값과 랜덤 값이 일치합니다");
				break;
			}

		}
		s.close();
	}

}