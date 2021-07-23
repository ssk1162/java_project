package 생성자;

public class Phone {
	
	String com;
	String tel;
	String name;
	
	
	public Phone(String com, String tel, String name) {
		this.com = com;
		this.tel = tel;
		this.name = name;
	}
	
	public String toString() {
		return "Phone [com=" + com + ", tel=" + tel + ", name=" + name + "]";
	}

	
}
