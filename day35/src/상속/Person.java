package 상속;

public class Person {

	// 상태(속성), 멤버변수
	String name; 
	int age;
	
	// 기본생성자는 다른 생성자메서드가 없으면 자동 생성
	// 다른 생성자메서드가 있으면 자동 생성되지 않는다
	// 생성자를 사용하는 이유
	// 1 객체생성시 자동호출되므로 생성할 때 자동으로 꼭 실행해주고 싶은 부분이 있으면 생성자에 넣어주면 자동 실행됨
	// 2 객체생성시 입력값에 대한 제약조건을 걸고 싶은 경우
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	// 동작
	
	public void think() {
		System.out.println("귀여울려나");
	}
	public void tool() {
		System.out.println("아장아장");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
