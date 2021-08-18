package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		/*
			기본데이터2
			색을 저장 ( r )
			호실을 저장 ( 709 )
			평균나이를 저장 ( 27.5 )

			1 선언
			2 대입
			3 출력
			4 그림
 			
 			예약어는 저장공간의 공간을 쓸 수 없다
			char, int, double	
		 */
		
		// 1 선언
		char color;
		int num;
		double avgAge;	//	낙타표기법, avg_age ( 파이썬, 뱀표기법 )
		
		// 2 할당, 대입
		color = 'r';
		// 변수하나에 값이 하나만 저장!
		num = 709;
		avgAge = 27.5;
		/*
			변수 ( variable, 값이 변한다 ) : 램에 저장공간에 들어갈 값은 변할 수 있다
			램에 만들어지는 저장공간을 변수라고 부른다
		*/
		
		// 3 출력
		System.out.println("색 : " + color); //	결합연산자
		System.out.println("방번호는 : " + num + "호");
		System.out.println("평균 나이 : " + avgAge);
		/*
			한줄 복사 : 컨트로 + 알트 + 화살표아래
			한줄 이동 : 알트 + 이동방향화살표
			한줄 삭제 : 컨트롤 + d
		*/
	}

}
