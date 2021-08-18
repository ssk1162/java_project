package 문제풀이;

import java.util.Date;

public class 시간 {

	public static void main(String[] args) {
		/*
		 * 시간을 구해보세요
		 * 10시 전이면 굿모닝
		 * 15시 전이면 굿애프터눈
		 * 20시 전이면 굿이브닝
		 * 나머지는 굿나잇
		 */
		
		Date date = new Date();
		int hour = date.getHours();
		String result = "";
		
		if (hour <10) {
			result = "굿모닝";
		} else if (hour < 15) {
			result = "굿애프터눈";
		} else if (hour < 15) {
			result = "굿애프터눈";
		} else if (hour < 20) {
			result = "굿애프터눈";
		} else {
			result = "굿나잇";
		}
		System.out.println(result);
		
		/*
		 * 요일이 토/일이면 쉬어요
		 * 나머지요일이면 달려요
		 */
		
		int day = date.getDay();
		
		System.out.println(day);
		
		if (day == 0) {
			System.out.println("토/일요일은 쉬어요");
		} else {
			System.out.println("달립니다");
		}
		
		/*
		 * 월이 3~5이면 봄
		 * 6~8이면 여름
		 * 9~11이면 가을
		 * 나머지면 겨울
		 */
		
		int month = date.getMonth() + 1;
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨율");
			
		}
	}

}
