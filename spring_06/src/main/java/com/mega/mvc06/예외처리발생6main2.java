package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리발생6main2 {

	public static void main(String[] args) {
		
		예외처리발생6 error = new 예외처리발생6();
		try {
			error.call();
		} catch (Exception e) {
			System.out.println("호출한 곳엣서 다르게 알아서 처리함");
		}
		System.out.println("에러 발생후 실행될까요");
		System.out.println("에러 발생후 실행될까요");
		System.out.println("에러 발생후 실행될까요");
		System.out.println("에러 발생후 실행될까요");
		System.out.println("에러 발생후 실행될까요");
		System.out.println("에러 발생후 실행될까요");
		
	}
}