package 배열사용;

import java.util.Scanner;

public class 인기투표101 {

	public static void main(String[] args) {

		String[] bike = { "레블500", "할리데이비슨", "두카티" };
		int[] nu1 = new int[3];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("인기투표 0)레블500, 1)할리데이비슨, 2)두카티, 3)종료");
			System.out.print("가장 원하걸 투표!>> ");
			int num = sc.nextInt();
			sum++;
			if (num == 3) {
				System.out.println("투표 종료");
				System.out.println();
				
				for (int i = 0; i < nu1.length; i++) {
					System.out.println(bike[i] + ": " + nu1[i] + "표");
				}
				System.out.println("총 투표 " + (sum - 1) + "표");
				System.exit(0);

			}
			nu1[num]++;
			System.out.println(bike[num] + "표 득표");
			System.out.println();
		}

	}

}
