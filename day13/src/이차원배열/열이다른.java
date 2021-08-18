package 이차원배열;

import java.util.Random;

public class 열이다른 {

	public static void main(String[] args) {
		// 1 배열 처음에 만들 때 값을 이미 알고 있는 경우
		
		int[][] n1  = {
				{1,2,3},
				{1,2,3,4},
				{1,2,3,4,5}
		};
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
		// 2 배열 처음에 만들 때 값을 모르고 있는 경우
		// 2-1 1차원 열을 만들어라
		// 2-2 1차원 배열을 2차원 배열의 각 행에 끼워넣어라
		int[][] n5= new int[3][];
		
		int[] n2 = new int[3];
		int[] n3 = new int[4];
		int[] n4 = new int[5];
		
		n5[0] = n2;
		n5[1] = n3;
		n5[2] = n4;
		
		for (int i = 0; i < n5.length; i++) {
			for (int j = 0; j < n5[i].length; j++) {
				System.out.print(n5[i][j] + " ");
			}
			System.out.println();
		}
		
		// 랜덤한 값을 1~100
		// 4*5에 넣으세요
		// 전체를 프린트
		
		Random r = new Random();
		int a[][] = new int[4][5];
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = r.nextInt(100);
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
