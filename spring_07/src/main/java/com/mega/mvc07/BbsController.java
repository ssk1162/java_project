package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 어노테이션 달아놓은 클래스들은 스프링 프로젝트에서 모두다 싱글톤
@Controller // 어노테이션 Annotation
public class BbsController {
	
	
	// 요청되는 가상 주소는 중복되면 절대 안댐
	@RequestMapping("bbs")
	public void bbs(BbsDTO bbsDTO, String date) {
		// 컨트롤러의 입력값으로 넣은 변수는 프로토타입 변수
		// 컨트롤러에서 받은거 확인 출력
		System.out.println("번호 " + bbsDTO.getbNo());
		System.out.println("제목 " + bbsDTO.getTitle());
		System.out.println("내용 " + bbsDTO.getContent());
		System.out.println("작성자 " + bbsDTO.getWriter());
		System.out.println(date);
		// views아래에 결과 화면 만들어서 넣어주세요
		
		
	}
	
}
