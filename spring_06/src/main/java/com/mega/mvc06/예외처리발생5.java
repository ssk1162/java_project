package com.mega.mvc06;

public class 예외처리발생5 {

	public void call() {
		
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("내가 예외처리 다함");
		}
		
	}

}