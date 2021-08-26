package com.mega.mvc06;

import java.io.FileWriter;

public class 예외처리발생3 {

	public static void main(String[] args) {
		
		System.out.println("1번 나는 프린트될까요");
		try {
			//System.out.println("2번 나는 문제 발생 줄" + 10/0);
			FileWriter file = new FileWriter("/test.txt");
			file.write("내가 첫줄\n");
			file.write("내가 둘째 줄\n");
			
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("3번 나 프린트될까요");
		
	}

}
