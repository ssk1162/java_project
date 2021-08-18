package 배열응용;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		
		Random r = new Random(42);
		int[] jumsu = new int[100];
		
		//랜덤한 값 하나 만들어서 배열의 특정한 인덱스에 저장
		for (int j = 0; j < jumsu.length; j++) {
			jumsu[j] = r.nextInt(100); //범위를 줄이 /0~100 = 101
		}
		for (int i : jumsu) {
			System.out.println(i);
		}
		
		
	}

}
