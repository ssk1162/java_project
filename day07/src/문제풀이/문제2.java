package 문제풀이;

public class 문제2 {

	public static void main(String[] args) {
		// 1부터 1000까지 중 3씩 점프 만약 더한 값이 100이 넘으면 더하기 종료
		// 5의 배수는 더하지 않습니다

		int sum = 0;
		int count = 0;

		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum > 100) {
				break; // for문 종룔
			}

			if (i % 5 == 0) {
				continue; // 이번 횟수가 제외하고 for문은 계속 돈
			}
			sum = sum + i;
			count++;

		}
		System.out.println(sum);
		System.out.println(count);
	}

}
