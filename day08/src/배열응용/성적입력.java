package 배열응용;

import java.util.Scanner;

public class 성적입력 {

	public static void main(String[] args) {
		
		// int a, b, c, d, e;
		int[] jumsu = new int[5]; // {0,0,0,0,0}
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("성적 입력 >> ");
			jumsu[i] = sc.nextInt();
		
		}
		for (int i : jumsu) {
			System.out.println(i);
		}
		
	}

}
