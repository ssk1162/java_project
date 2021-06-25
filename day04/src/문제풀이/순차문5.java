package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문5 {

	public static void main(String[] args) {

		/*
		 * 내가 먹고 싶은 음식은? 팥빙수
		 * 친구가 먹고 싶은 음식은 팥빙수
		 * 아하! 나랑 친구랑 같아요
		 * 크~! 나랑 친구랑 달라요
		 */
		
		String food = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String food1 = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");
		
		String food2 = "팥빙수";
		String food3 = "팥빙수";
		
		if (food.equals(food2) && food1.equals(food3)) {
			System.out.println("아하! 나랑 친구랑 같아요");
		} else {
			System.out.println("크~! 나랑 친구랑 달라요");

		}
		
	}

}
