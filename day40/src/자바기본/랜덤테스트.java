package 자바기본;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int start = r.nextInt(100); // 0~99
		int end = r.nextInt(10) + 1000; // 1000~ 1009
		
		int sum = 0;
				
		for (int i = start; i < end; i++) {
			
			if (i % 3 == 0) {
				sum += i;
			}
			
		}
		System.out.println("합 " + start);
		System.out.println("합 " + end);
		System.out.println("합 " + sum);
	}

}
