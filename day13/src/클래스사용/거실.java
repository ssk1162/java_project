package 클래스사용;

import 클래스생성.Phone;
import 클래스생성.dog;

public class 거실 {
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.aa();
		phone.bb();
		phone.color = "흰색";
		phone.from = "식탁 위";
		
		System.out.println(phone.color);
		System.out.println(phone.from);
		
		dog dog1 = new dog();
		dog1.color= "검은색";
		dog1.leg = "다리가 짧은";
		dog1.cc();
		dog1.dd();
		
		System.out.println(dog1.color);
		System.out.println(dog1.leg);
		
		
	}
	
}
