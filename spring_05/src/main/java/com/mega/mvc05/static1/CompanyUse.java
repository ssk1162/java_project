package com.mega.mvc05.static1;

public class CompanyUse {
	
	public static void main(String[] args) {
		
		Company c1 = new Company("홍길동", "남", 25);
		Company c2 = new Company("김길동", "여", 26);
		Company c3 = new Company("송길동", "남", 27);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("직원 수 = " + Company.count + "명");
		System.out.println("평균나이 = " + Company.sum/Company.count + "살");
		
	}
}
