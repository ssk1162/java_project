package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//기능하나당 public 하나

// dao는 무조건 싱글톤으로 만들어주어야 한다

@Repository // 싱글톤으로 만들어준다 싱글톤을 만들어줄 객체가 아니면 어노테이샨 달면 않는다
public class MemberDAO {
	
//	스프링이 싱글톤으로 만들면 스프링이 가지고 있는 정보 3가지 // @Autowired
//	클래스명: SqlSessionTemplate, // @Inject
//	만들어진 객체명: myBatis
//	주소:100
	
	// @Inject("mybatis")
	@Autowired
	SqlSessionTemplate myBatis; // 100
	
	public List<MemberDTO> list() {
		
		List<MemberDTO> list = myBatis.selectList("member.all");
		return list;
	}
	
	public boolean login(MemberDTO dto) {
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false; // 컨트롤러의 결과를 알려주기 위한 변수
		if (dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			result = true;
		}
		
		return result;
		
	}
	
	
	
//	public boolean check(MemberDTO dto) {
//		String dbNick = "superman";
//		boolean result2 = false; // 컨트롤러의 결과를 알려주기 위한 변수
//		if (dto.getNick().equals(dbNick)) {
//			result2 = true;
//		}
//		
//		return result2;
//		
//	}
	
	
	
	public void create(MemberDTO memberDTO) {
		myBatis.insert("member.create", memberDTO);
		
	}

	public MemberDTO read(MemberDTO memberDTO) {
		MemberDTO dto = myBatis.selectOne("member.one", memberDTO);
		return dto;
	}

	public void update() {
		
	}

	public int delete(MemberDTO memberDTO) {
		int result = myBatis.delete("member.del", memberDTO);
		return result;
	}

}
