package 문제풀이;

public class 깊은복사는언제쓰나 {

	public static void main(String[] args) {
		
		int[] term1 = {100,88,99,77,22};
		
		int[] term2 = term1.clone();
		
		term2[4] = 66;
		
		System.out.println(term2);
		
		
	}

}
