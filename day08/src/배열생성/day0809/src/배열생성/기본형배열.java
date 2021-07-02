package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {
		
		//int[] 변수명: int로 만들어진 배열을 가르키는 주소가 변수명에 들어간
		int[] s = new int[10];
		double[] s1 = new double[5];
		String[] s2 = new String[100];
		//배열은 자동으로 초기화시켜줌
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2[0]);
	}

}