package interfaceTest;

public interface MemberDAOinterface {

	// 불완전한 메서드 >> 추상메서드만!
	// 규칙만 정의한 문서역할
	// Refactor > Extrack interface로 생성 가능
	// 각 메서드 앞에 public, abstrack , public abstrack 생략 가능
	// 3개의 문자은 인터페이스 파일 내에서 동일한 의미를 가진다
	public abstract int insert(String id, String pw, String name, String tel);

	abstract int update(String id, String tel);

	public int delete(String id);

	String select(String id);

}