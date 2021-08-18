package 문제풀이;

public class 문제1 {

	public static void main(String[] args) {
		// 33~222까지 더하기
		int sum = 0;
		
		for (int i = 33; i <= 222; i++) {
			
			sum = sum + i;
			System.out.println(i + ": " + sum);
		}
		System.out.println(sum);
		
		// 55~4500 2씩 점프해서 더하기
		// i++ >> i = i + 1;
		int sum1 = 0;
		
		for (int i = 55; i <= 4500; i = 2 + i) {
			
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
		// 0~6000 5씩 점프해서 더하기
		int sum2 = 0;
		
		for (int i = 0; i <= 6000; i = 5 + i) {
			
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	}

}
