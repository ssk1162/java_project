package interfaceTest;

public class 컴퓨터사용 {
	
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		BananaComputer b1 = new BananaComputer();
		
		c1.monitor();
		c1.keyborad();
		c1.mouse();
		
		b1.monitor();
		b1.keyborad();
		b1.mouse();
	}
	
}
