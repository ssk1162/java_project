package interfaceTest;

public class Computer implements Computerinterface {
	
	@Override
	public void monitor() {
		System.out.println("모니터는 LG");
	}
	
	@Override
	public void keyborad() {
		System.out.println("키보드는 애플키보드");
	}
	
	@Override
	public void mouse() {
		System.out.println("마우스는 트랙패드");
	}
	
}
