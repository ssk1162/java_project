package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		/*
			나의 대한 정보
			내이름, 내나이, 내키, 성별, 점심먹었나요?
		*/
		
		String name = "권순선"; //	문자열
		int age = 29;
		double weight = 188.7;
		char gender = '남';
		boolean food = true; //	false
		
		System.out.println(name);
		System.out.println(age + 1);
		System.out.println(weight);
		
		weight = weight - 10;
		System.out.println(weight);
		
	}

}
