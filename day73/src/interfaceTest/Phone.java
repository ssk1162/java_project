package interfaceTest;

public class Phone implements Phoneinterface {

	@Override
	public void contract(int con) {
		System.out.println("약정을 했다");
	}

	@Override
	public void Performance(String per) {
		System.out.println("성능이 좋다");

	}

	@Override
	public void Kinds(String kin) {
		System.out.println("아이폰13을 샀다");

	}

}
