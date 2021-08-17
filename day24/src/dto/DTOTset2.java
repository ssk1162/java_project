package dto;

public class DTOTset2 {

	public static void main(String[] args) {
		
		// 게시판Bag을 2개 만들어서, 값들을 넣어보고,
		// 넣은 값들을 프린트해보세요 toString()
		// 그림그려보세요
		
		게시판Bag2 bag = new 게시판Bag2();
		bag.setId("apple");
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		System.out.println(bag);
		
		게시판Bag2 bag2 = new 게시판Bag2();
		bag2.setId("melon");
		bag2.setPw("melon");
		bag2.setName("melon");
		bag2.setTel("melon");
		System.out.println(bag2);
		
	}

}
