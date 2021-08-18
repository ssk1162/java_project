package 자바심화;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 친구추가문제2 {

	public static void main(String[] args) {

		// 친구목록 들어갈 리스트
		HashMap<String, String> friends = new HashMap<>();
		friends.put("홍길동", "010-1111-2222");
		friends.put("김길동", "010-2222-3333");

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("-----------------");
			System.out.println("1. 친구 리스트 출력 ");
			System.out.println("2. 친구 추가 ");
			System.out.println("3. 친구 삭제 ");
			System.out.println("4. 이름 변경 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴를 선택하시오 ");

			int choice = sc.nextInt();

			if (choice == 9) {
				System.out.println("시스템 종료");
				break;
			} else if (choice == 1) {
				System.out.println(friends);

			} else if (choice == 2) {
				System.out.print("추가할 친구 이름 입력 ");
				String name = sc.next();
				System.out.println("추가할 친구 번호 입력");
				String tel = sc.next();
				int size1 = friends.size();
				friends.put(name, tel);
				int size2 = friends.size();
				if (size2 > size1) {
					System.out.println("친구가 추가되었습니다");
				}

			} else if (choice == 3) {
				System.out.print("삭제할 친구 입력 ");
				System.out.println(friends);
				System.out.print("삭제할 친구를 고르시오 ");
				String num = sc.next();
				friends.remove(num);
				if (!friends.containsKey(num)) {
					System.out.println("삭제가 완료되었습니다");
				}

			} else if (choice == 4) {
				System.out.println("이름 변경할 친구 이름 입력");
				System.out.println(friends);
				
				System.out.print("수정할 이름를 입력하시오 ");
				String num = sc.next();
				System.out.print("수정할 번호를 입력하시오 ");
				String tel = sc.next();
				friends.put(num, tel);
				System.out.println("수정이 완료되었습니다");

			} else { // 1~4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다 다시 입력");

			}

		}

		sc.close();

	}

}
