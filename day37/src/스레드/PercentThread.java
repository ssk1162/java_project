package 스레드;

public class PercentThread extends Thread {
	
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("% " + i);
		}

	}
}
