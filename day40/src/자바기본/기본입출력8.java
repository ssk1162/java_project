package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력8 {

	public static void main(String[] args) {

		// 시작할 값 입력, 종료할 값 입력
		// 5의 배수만 더해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 ");
		int start = sc.nextInt();
		System.out.print("종료값 ");
		int end = sc.nextInt();
		
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = start; i < end; i++) {
			if (i % 5 == 0) {
				sum += i ;
		
				list.add(i);
			}
		}
		double avg = (double)sum / list.size();
		System.out.println("합 " + sum);
		System.out.println("목록 " + list.size());
		System.out.println("평균 " + avg);
		System.out.println("카운트 " + list);
		sc.close();
	}
		
}
