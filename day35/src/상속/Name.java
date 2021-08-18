package 상속;

public class Name {
	
	public static void main(String[] args) {
		
		Manager nG = new Manager();
		
		nG.name = "tttt";
		nG.address = "TTTT";
		nG.salary = 5;
		nG.rrn = 6;
		nG.bonus = 7;
		
		System.out.println(nG);
		nG.aa();
		nG.bb();
		nG.cc();
		nG.dd();
		nG.test();
		
	}
	
}
