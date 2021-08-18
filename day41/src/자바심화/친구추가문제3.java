package 자바심화;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 친구추가문제3 {

	public static void main(String[] args) {

		// 친구목록 들어갈 리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("아메리카노");
		list.add("라때");
		list.add("콜드브루");
		
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("-----------------");
			System.out.println("1. 카페 메뉴 ");
			System.out.println("2. 메뉴 추가 ");
			System.out.println("3. 메뉴 삭제 ");
			System.out.println("4. 메뉴 변경 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴를 선택하시오 ");

			int choice = sc.nextInt();

			if (choice == 9) {
				System.out.println("시스템 종료");
				break;
			} else if (choice == 1) {
				System.out.println(list);

			} else if (choice == 2) {
				System.out.print("추가할 메뉴 입력 ");
				String name = sc.next();
				int size1 = list.size();
				list.add(name);
				int size2 = list.size();
				if (size2 > size1) {
					System.out.println(name + " 메뉴가 추가되었습니다");
				}

			} else if (choice == 3) {
				System.out.println("삭제할 메뉴 번호 입력");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "번: " + list.get(i));
				}
				System.out.print("삭제할 번호를 고르시오 ");
				int no = sc.nextInt();
				String name = list.get(no);
				list.remove(no);
				if (!list.contains(name)) {
					System.out.println("삭제가 완료되었습니다");
				}

			} else if (choice == 4) {
				System.out.println("신상으로 변경할 메뉴 입력");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "번: " + list.get(i));
				}
				System.out.print("변경할 번호를 입력하시오 ");
				int index = sc.nextInt();
				System.out.print("변경할 메뉴를 입력하시오 ");
				String name = sc.next();
				list.set(index, name);
				System.out.println(name + " 수정이 완료되었습니다");

			} else { // 1~4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다 다시 입력");

			}

		}

		sc.close();

	}

}
