package 알고리즘;


import java.util.Arrays;
import java.util.Random;

public class 최소값구하기2 {

	public static void main(String[] args) {
	
		// 시드값 100, 1~1000까지의 값을 랜덤하게 10000개 만들어서 최소값을 찾아보세요
		// 1 최소값을 찾아보세요
		// 2 개수를 세어보세요
		// 3 위치값을 찾아보세요
				
				Random r = new Random(100);
				
				int[] a = new int[10000];
				
				for (int i = 0; i < a.length; i++) {
					a[i] = r.nextInt(1000) + 1;
				}
				
				int min1 = a[0];
				int count1 = 0; // 1이 몇개인가?
				
				for (int i = 1; i < a.length; i++) {
					if (a[i] < min1) {
						min1 = a[i];
					}
				}
				
				System.out.println("최소값은 " + min1); // 1
				
				String result = "";
				for (int i = 0; i < a.length; i++) {
					if (a[i] == min1) {
						count1++;
						//System.out.println(i);
						result += i + " ";
					}
					
				}
				System.out.println("최소값 갯수 " + min1 + "\n" + "위치값은 " + count1);
				System.out.println(result);
				
				// 파괴합수를 써서 정렬 후 최소값/최대값을 찾아보자
				Arrays.sort(a);
				System.out.println(a[0]);
				System.out.println(a[a.length-1]);
	}
	
}
