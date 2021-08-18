package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {

		// 반복문과 배열은 함께
		// int[]: int배열을 가르키는 주소가 들어간다는 의미
		// s: 힙영역에 할당된 저장공간의 주소가 들어간다
		// =: 힙영역에 할당된 저장공간의 주소를 변수에 넣는다
		// new: 힙영역에 지정된 타입의 크기만큼 배열을 만들어라
		// int[10] : 배열로 만들어질 데이터의 타입과 크기가 설정
		int[] s = new int[10]; // 메인영역 s 1개 / 힙영역 int[10]; 10개 / length 1개 = 12개

		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + 1 + " ");
		}
	}

}
