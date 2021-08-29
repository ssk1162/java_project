package com.mega.mvc07.test;

public class MyGirlsMain {
	
	public static void main(String[] args) {
		
		Girl girl1 = new Girl("길숙", 13);
		Girl girl2 = new Girl("길숙", 10);
		
		System.out.println(girl1);
		System.out.println(girl2);
		System.out.println(Girl.count + "명");		
		System.out.println(Girl.sum + "살");		
		System.out.println(((double)Girl.sum/Girl.count) + "살");		
		
	}
	
}
