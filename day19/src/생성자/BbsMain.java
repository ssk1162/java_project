package 생성자;

public class BbsMain {

	public static void main(String[] args) {
		System.out.println("게시판");
		System.out.println("--------------------------");
		Bbs b1 = new Bbs("title","content","writer");
		Bbs b2 = new Bbs("java","fun java","park");
		Bbs b3 = new Bbs("jsp","fun jsp","hong");
		Bbs b4 = new Bbs("spring","fun spring","kim");
		
		System.out.println("no " + b1);
		System.out.println("1  " + b2);
		System.out.println("2  " + b3);
		System.out.println("3  " + b4);
		
	}

}
