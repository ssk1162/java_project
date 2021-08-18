package 상속;

public class Baby extends Person {
	
	int speed;
	
	public void run() {
		System.out.println("빠르게 기어다니다");
	}

	@Override
	public String toString() {
		return "Baby [speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	
}
