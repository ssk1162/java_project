package 자바심화;

import java.util.ArrayList;
import java.util.Scanner;

public class 친구추가문제4 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("어벤져스 4D");
		list.add("헐크");
		list.add("초밥왕");
		ArrayList<String> list2 = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("-----------------");
			System.out.println("1. 현재 상영 영화 리스트.");
			System.out.println("2. 영화 선택.");
			System.out.println("3. 영화 선택 취소.");
			System.out.println("4. 선택한 영화 목록");
			System.out.println("9. 결제 및 종료.");
			System.out.print("번호 선택 >>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("결제가 완료 되었습니다.");
				break;
			}else if(choice == 1) {
				System.out.println(list.toString());
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(i + 1 + "번: " + list.get(i));
//				}
			}else if(choice == 2) {
				int price = 7000;
				int price2 = 10000;
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + "번: " + list.get(i));
				}
				System.out.print("보고싶은 영화를 선택해주세요!");
				int choo = sc.nextInt();
				if (choo == 1) {
					System.out.println("어벤져스 4D 를 선택하셨습니다!");
					System.out.print("관람인원을 적어주세요>> ");
					int per = sc.nextInt();
					list2.add("어벤져스 4D");
					System.out.println(per * price2);
				}else if(choo == 2) {
					System.out.println("헐크를 선택하셨습니다!");
					System.out.print("관람인원을 적어주세요>> ");
					int per = sc.nextInt();
					list2.add("헐크");
					System.out.println(per * price);
				}else if(choo == 3) {
					System.out.println("초밥왕을 선택하셨습니다!");
					System.out.print("관람인원을 적어주세요>> ");
					int per = sc.nextInt();
					list2.add("초밥왕");
					System.out.println(per * price + " 원 입니다.");
				}
			}else if(choice == 3) {
				System.out.println(list2.toString());
				System.out.print("취소할 영화를 입력하세요 >> ");
				String delete = sc.next();
				list2.remove(delete);
				System.out.println(list2.toString());
				System.out.println("취소되었습니다!");
			}else if(choice == 4) {
				System.out.println(list2.toString());
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
		
		
		
		
	}//main
}//class