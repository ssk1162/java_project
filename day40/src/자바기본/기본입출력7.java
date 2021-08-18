package 자바기본;

public class 기본입출력7 {

	public static void main(String[] args) {

		// 시작은 100부터 시작 500이 되기 전가지 전체를 더해보세요
		int sum = 0;
		int i2 = 100; // 카운트초기값
		while (true) { // 반복할 조건
			
			sum += i2;
			i2++;
			if (i2 == 500) break;
			
		}
		System.out.println(sum);
		
	}
}
