package com.mega.mvc13;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//기능하나당 public 하나

// dao는 무조건 싱글톤으로 만들어주어야 한다

@Repository // 싱글톤으로 만들어준다 싱글톤을 만들어줄 객체가 아니면 어노테이샨 달면 않는다
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate myBatis;
	
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

	public void read() {
		
	}

	public void update() {
		
	}

	public void delete() {
		
	}

}
