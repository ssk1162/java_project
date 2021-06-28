package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {

		/*
		 * //new Random r = new Random(); 
		 * JFrame f = new JFrame(); 
		 * JButton b1 = new JButton(); 
		 * JTextField name = new JTextField(); 
		 * JLabel l = new JLabel();
		 */

		Random r = new Random(38); //씨앗값(seed)
		int num = r.nextInt(100); //0~99
		System.out.println(num);

		// 50보다 작은 임의의 수 생성
		
		int num1 = r.nextInt(50);
		System.out.println(num1);
		
		// 5 ~ 49
		
		int num4 = r.nextInt(45) + 5;
		System.out.println(num4);
		
		// 1000보다 작은 임의의 수 생성
		
		int num2 = r.nextInt(1000);
		System.out.println(num2);
		
		// 100 ~ 999
		
		int num3 = r.nextInt(900) + 100;
		System.out.println(num3);
		
		// 3 ~ 22
		
		int num5 = r.nextInt(20) + 3;
		System.out.println(num5);
		
		
	}

}
