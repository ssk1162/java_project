package com.mega.mvc08.casting;

public class 실수처리 {

	public static void main(String[] args) {
		double pie = -3.554159;
		
		System.out.println(Math.abs(pie));
		System.out.println(Math.round(pie));
		System.out.println(Math.floor(pie));
		System.out.println(Math.ceil(pie));
		
		System.out.println(Math.random()); // 0 ~ .. < 1
		System.out.println(Math.random() + 10); // 0 ~ .. < 1
		
		
		System.out.println(String.format("%.2f", pie));
		System.out.printf("내 나이 %10d살이다 \n", 20);
		System.out.printf("내 시력 %.2f이다 \n", 0.951);
		System.out.printf("내 이름 %s이다", "콩콩");
		
		
	}

}
