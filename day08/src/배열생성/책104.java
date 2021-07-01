package 배열생성;

public class 책104 {

	public static void main(String[] args) {

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
				System.out.println("짝수 " + evenSum);
			} else {
				oddSum += i;
				System.out.println("홀수 " + oddSum);
			}

		}

	}
}
