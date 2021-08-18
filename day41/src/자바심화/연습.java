package 자바심화;

import java.util.HashMap;
import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. HashMap을 이용하여 예약된 이름과 백신을 출력하세요.
//		("홍길동", "얀센"), ("정길동", "모더나"), ("김길동", "화이자")
//		* 각 과정의 처리 후 잘 처리가 되었는지 명단을 출력해 확인하세요.
//		2. 박길동을 AZ 접종 예약을 추가하세요.
//		3. 김길동의 예약을 모더나로 변경하세요.
//		4. 정길동의 예약을 취소하세요.
//		5. 마지막에 시스템을 종료하세요.
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("홍길동", "얀센");
		hm.put("정길동", "모더나");
		hm.put("김길동", "화이자");
		
		while (true) {
			
			System.out.println("--------------------------");
			System.out.println("1. 예약된 리스트 출력");
			System.out.println("2. 예약 추가");
			System.out.println("3. 예약 변경");
			System.out.println("4. 예약 취소");
			System.out.println("9. 종료");
			System.out.println("--------------------------");
			System.out.print("번호를 선택해주세요 >> ");
			
			int a = sc.nextInt();
			
			if (a == 9) {
				System.out.println("시스템 종료");
				break;
				
			} else if (a == 1) {
				System.out.println(hm);
			
			} else if (a == 2) {
				System.out.print("예약할 이름을 입력 ");
				String name = sc.next();
				System.out.print("예약할 백신 입력 ");
				String vaccine = sc.next();
				int size1 = hm.size();
				hm.put(name, vaccine);
				int size2 = hm.size();
				if (size2 > size1) {
					System.out.println(name + vaccine + " 예약 완료했습니다");
				}
				
				
			} else if (a == 3) {
				System.out.println(hm);
				
				System.out.print("예약 변경할 이름 입력");
				String name = sc.next();
				System.out.print("예약 변경할 백신 입력");
				String vaccine = sc.next();
				hm.put(name, vaccine);
				System.out.println(name + vaccine +" 변경 되었습니다");
				
			} else if (a == 4) {
				System.out.println(hm);
				
				System.out.print("예약 취소할 이름 입력 ");
				String name = sc.next();
				System.out.print("예약 취소할 백신 입력 ");
				String vaccine = sc.next();
				
				hm.remove(name, vaccine);
				System.out.println(name + vaccine +" 예약 취소했습니다");
				
			} else {
				System.out.println("다른 입력값을 선택하세요");
			
			}
			
			
		}
		
	}

}
