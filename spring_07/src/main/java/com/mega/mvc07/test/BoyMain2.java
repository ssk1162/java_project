package com.mega.mvc07.test;

public class BoyMain2 {

	public static void main(String[] args) {
		
		Boy2 boy1 = Boy2.getinstance();
		Boy2 boy2 = Boy2.getinstance();
		
		System.out.println(boy1);
		System.out.println(boy2);
		System.out.println(Boy2.count);
	}

}
