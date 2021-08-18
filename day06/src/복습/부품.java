package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class 부품 {

	public static void main(String[] args) {
		
		//망치
		//너무 자주 사용하여 램에 이미 들어가있음
		//클래스이르므로 바로 사용 가능
		//Integer, Double, System, JOptionPane
		//기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부
		//함수를 가지고 있는 부품을 선
		//벽돌
		//Date date;
		//date = new Date();
		
		//Date라는 부품을 복사해서 램에 변수를 만들어 저장
		//cpu는 모든 부품을 램에 가져다놓고 조립한다
		//Date date; //저장되는 타입 변수명;(선언)
		//선언: 램에 저장공간을 만드는 것
		
		Date date = new Date();
		
//		Random r = new Random(); //입력값 써도되고 안서도댐
//		Scanner sc = new Scanner(System.in); //입력값 필수
		
		int hour = date.getHours(); //10
		System.out.println("현재 시간은 " + hour + "시");
		
		//함수는 반환이 있는 것이 있고 없는 것이 있다
		//반환을 리턴이라고 부른다
		//반환이 있는 함수만 프린트가 가능하다
		System.out.println(date.getMinutes());
		//System.out.println(System.out.println);
		//반환이 없는 경우에는 void라고 써있다 void 없다라는 의미
		
		int month = date.getMonth() + 1;
		String result = "해당 계절이 없습니다";
		if (month >= 3 && month <= 5) {
			result = "봄";
		} else if (month >= 6 && month <= 8) {
			result = "여름";
		} else if (month >= 9 && month <= 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		System.out.println(result);
		
		System.out.println("===========================================");
		
		int day = date.getDay(); //요일
		
		if (day == 0 || day == 6) {
			System.out.println("주말에는 놀아");
		} else {
			System.out.println("주중에는 달림");
			
		}
		
		while (true) {
			System.out.println("달려요!! 달려요!!"); //1
			System.out.println("또 달려"); //2
			System.out.println("마지막 달려"); //3
			
			break;
		}
		
		switch (month) {
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
			
		default: //else
			System.out.println("봄");
			break;
		}
		
		// 2:28, 3,5,7,8,10,12:31, 나머지: 30
		// 정수(int), 실수는 지원하지 않음, 문자1, String
		
		switch (month) {
		case 2:
			System.out.println("28");
			break;
			
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		
		default:
			System.out.println("30");
			break; //생략 가능
		}
		
		
		
		
		
		
		
	}

}
