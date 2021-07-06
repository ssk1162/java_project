package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {
		
		String[] subject = {"컴퓨터","국어","수학","영어","체육"};
		int[] term1 = {77,88,99,80,70};
		int[] term2 = {99,100,88,80,70};
		
		// 1 성적이 2학기 향상된 과목의 수를 카운트
		
		int count = 0;
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}
		System.out.println(count);
		
		// 2 성적이 1,2학기 동일한 과목의 수를 카운트
		
		int count1 = 0;
		int location = -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count1++;
				location = i;
				System.out.println(subject[location]);
			}
		}
		System.out.println(count1);
		// 3 성적이 1,2학기 동일한 과목명을 프린트
		if (location != -1) {
			System.out.println(subject[location]);
			
		} else {
			System.out.println("동일한 과목이 없음");
			
		}
		
		
	}

}
