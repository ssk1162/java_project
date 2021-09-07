package com.mega.mvc14;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 싱글톤 객체, 스프링에 컨트롤러로 등록
@Controller
public class MemberController {

	@Autowired
	MemberDAO dao; // 스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다

	@RequestMapping("del.mega")
	public String name(MemberDTO memberDTO) {
		int result = dao.delete(memberDTO);
		return "redirect:list.do";
	}

	@RequestMapping("list.mega")
	public void list(Model model) { // select할땐 model을 써준다

		List<MemberDTO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println("회원 전체 수 " + list.size());
	}

	@RequestMapping("create.do")
	public void create(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		dao.create(memberDTO);

	}

	// 주소하나당 메서드하나
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO, HttpSession session) {
		// 컨트롤러의 메서드내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 프린트: " + dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			session.setAttribute("id", memberDTO.getId());
			// ${id} : 세션출력
			return "ok"; // views/ok.jsp
		} else {
			return "no"; // views/no.jsp

		}
	}

	@RequestMapping("one.do")
	public void one(MemberDTO memberDTO, Model model) {
		System.out.println(memberDTO.getId());
		MemberDTO dto = dao.read(memberDTO);
		// dto의 데이터는 view/one.jsp로 출력되어야 클라이언트에게 보인다
		// model속성을 이용하면 views아래까지 데이터를 보내고 사라진다
		model.addAttribute("dto", dto);
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
