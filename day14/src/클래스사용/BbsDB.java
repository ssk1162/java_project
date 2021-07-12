package 클래스사용;

public class BbsDB {
	
	/*
	 * 메서드 만들때 고려점 1) 입력값 2) 반환값
	 * 입력값에서 정확하게 맟추어야하는 것 1) 개수 2) 타입 3) 순서
	 */
	
	public void create(String aa) {
		System.out.println(aa + "게시물 등록했습니다");
	}
	public void delete(String bb) {
		System.out.println(bb + "게시물 삭제했습니다");
	}
}
