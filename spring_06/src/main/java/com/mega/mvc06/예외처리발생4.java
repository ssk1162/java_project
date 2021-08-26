package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리발생4 {

	public static void main(String[] args) {
		
		System.out.println("1번 나는 프린트될까요");
		try {
			//System.out.println("2번 나는 문제 발생 줄" + 10/0);
			FileWriter file = new FileWriter("/test.txt");
			file.write("내가 첫줄\n");
			file.write("내가 둘째 줄\n");
			
			file.close();
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			System.out.println("파일에 쓰는 중 에러");
		} catch (Exception e) {
			System.out.println("모든 에러를 처리함");
		} finally {
			// 에러의 발생 유무와는 상관없이 반드시 꼭 실해해주어야하는 부분은 여기에 넣음
			System.out.println("예외처리 다 했음");
		}
		System.out.println("3번 나 프린트될까요");
		
	}

}
