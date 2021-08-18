package 배열생성;

public class 기본형배열3 {

	public static void main(String[] args) {

		// int크기 5인 배열을 생성해보세요
		// 배열의 크기를 프린트해보세요
		// 배열의 첫번째 값에 100을 넣어서 프린트
		// 배열의 마지막 위치에 500을 넣어서 프린트
		// 배열의 3번째 위치에 200을 넣어서 프린트
		// 배열의 전체 데이터를 프린트
		// 배열의 전체 데이터를 인덱스와 함께 프린트
		// 그림으로 그려보세요

		int[] a = new int[5];

		System.out.println(a.length);

		a[0] = 100;
		System.out.println(a[0]);

		a[a.length - 1] = 500; // a = a[0] a[1] a[2] a[3] a[4] + length 5 >> length - 1
		System.out.println(a[a.length - 1]);

		a[2] = 200;
		System.out.println(a[2]);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " : " + i);
		}

	}

}
