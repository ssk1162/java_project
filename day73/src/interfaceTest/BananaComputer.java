package interfaceTest;

public class BananaComputer implements Computerinterface {

	@Override
	public void monitor() {
		System.out.println("바나나 모니터도 역시 LG");		
	}

	@Override
	public void keyborad() {
		System.out.println("바나나 키보드는 필립스");
	}

	@Override
	public void mouse() {
		System.out.println("바나나 마우스는 레이저");
	}

}
