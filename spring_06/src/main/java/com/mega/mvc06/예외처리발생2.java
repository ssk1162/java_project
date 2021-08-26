package com.mega.mvc06;

public class 예외처리발생2 {

	public static void main(String[] args) {
		
		System.out.println("1번 나는 프린트될까요");
		try {
			System.out.println("2번 나는 문제 발생 줄" + 10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("3번 나 프린트될까요");
		
	}

}
