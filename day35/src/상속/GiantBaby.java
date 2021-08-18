package 상속;

public class GiantBaby extends Baby {

	boolean walk;
	
	public void soso() {
		System.out.println("걸어다니다");
	}

	@Override
	public String toString() {
		return "GiantBaby [walk=" + walk + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
