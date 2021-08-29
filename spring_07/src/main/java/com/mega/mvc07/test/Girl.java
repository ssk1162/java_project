package com.mega.mvc07.test;

public class Girl {
	
	String name;
	int age;
	
	static int sum;
	static int count;
	
	public Girl(String name, int age) {
		
		this.name = name;
		this.age = age;
		count++;
		sum += age;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + "]";
	}
	
	
}
