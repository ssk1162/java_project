package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {
		
		AtThread t1 = new AtThread();
		DollarThread t2 = new DollarThread();
		PercentThread t3 = new PercentThread();
		// cpu에 스레드를 등록해주어야함
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("스레드 종료");

	}

}
