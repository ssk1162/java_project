package com.mega.mvc08.casting;

import java.util.ArrayList;

public class Nade {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(1000);
		a.add(189.1);
		a.add(false);
		a.add('남');
		
		System.out.println(a);
		
		int money = (int)a.get(0);
		System.out.println(money + 2000);
		double key = (double)a.get(1);
		System.out.println(key + 10);
		
		boolean bab = (boolean)a.get(2);
		if (bab) {
			System.out.println("배부르다");
		} else {
			System.out.println("배고프다");
		}
		
		char gender = (char)a.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1,3이다");
		} else {
			System.out.println("주민번호는 2,4이다");
		}
		
	}

}
