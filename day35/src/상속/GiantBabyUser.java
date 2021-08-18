package 상속;

public class GiantBabyUser {
	
	public static void main(String[] args) {
		
		GiantBaby gBaby = new GiantBaby();
		gBaby.name = "제임스";
		gBaby.age = 5;
		gBaby.speed = 5;
		gBaby.walk = true;
		
		System.out.println(gBaby);
		gBaby.think();
		gBaby.tool();
		gBaby.soso();
		gBaby.run();
		
	}
	
	
	
	
	
}
