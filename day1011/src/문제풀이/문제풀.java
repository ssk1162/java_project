package 문제풀이;

public class 문제풀 {

	public static void main(String[] args) {
		
		String[] c = {"국어","영어","수학","컴퓨터","회화"};
		int[] a = {44,66,22,99,100};
		int[] b = a.clone();
		
		b[0] = 22;
		b[2] = 88;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("1학기 성적" + a[i] + " 2학기 성적" + b[i]);
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] == b[i]) {
				count++;
			}
		}
		System.out.println("동일한 과목수: " + count);
		
		int count1 = 0;
		int location = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] < b[i]) {
				count1++;
				location = i;
				System.out.println("성적이 오른 과목명: " + c[location]);
			}
		}
		System.out.println("성적 중 오른 과목수: " + count1);
		
	}

}
