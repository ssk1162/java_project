package 메서드반환값;

import java.util.Random;

public class 다양한리턴사용2 {

	public static void main(String[] args) {
		
		다양한리턴2 r2 = new 다양한리턴2();
		int result1 = r2.get(100); // result1 = 200
		System.out.println(result1);
		double result2 = r2.get(); // result2 = 11.11;
		System.out.println(result2);
		int[] result3 = r2.get2(); //{10,20,30,40,50}
		for (int i : result3) {
			System.out.print(i + " "); // 10 20 30 40 50
		}
		System.out.println();
//		Random rd = r2.get3();
//		System.out.println(rd.nextInt());
		
	}

}
