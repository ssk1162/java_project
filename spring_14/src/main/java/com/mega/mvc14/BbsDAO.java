package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate myBatis;
	
	// 기능별로 메서드 정의
//	public void create(BbsDTO bbsDTO) {
//		
//		System.out.println(bbsDTO);
//		int result = myBatis.insert("bbs.add", bbsDTO);
//		System.out.println(result);
//	}
	
	public List<BbsDTO> list() {
		
		List<BbsDTO> list = myBatis.selectList("bbs.all");
		return list;
	}
	
	public BbsDTO read(BbsDTO bbsDTO) {
		
		BbsDTO dto = myBatis.selectOne("bbs.one", bbsDTO);
		return dto;
	}

	public void update() {

	}

	public void delete() {

	}

}
