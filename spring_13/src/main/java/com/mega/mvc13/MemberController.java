package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 싱글톤 객체, 스프링에 컨트롤러로 등록
@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; // 스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다
	
	@RequestMapping("create.do")
	public void create(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		dao.create(memberDTO);
		
	}
	
	// 주소하나당 메서드하나
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		// 컨트롤러의 메서드내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 프린트: " + dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			return "ok"; // views/ok.jsp
		} else {
			return "no"; // views/no.jsp
			
		}
	}
	
//	@RequestMapping("check.mega")
//	public String check(MemberDTO memberDTO) {
//		System.out.println(memberDTO.getNick());
//		boolean result2 = dao.check(memberDTO);
//		if (result2) {
//			return "super"; // views/ok.jsp
//		} else {
//			return "common"; // views/no.jsp
//			
//		}
//	}
	
	@RequestMapping("password.mega")
	public String pass(String pass) {
		System.out.println(pass);
		if (pass.equals("1234")) {
			return "pass"; // views/ok.jsp
		} else {
			return "redirect:index.jsp";
			// response.sendRedirect("index.jsp");
			
		}
	}
	
}
