package com.mega.mvc14;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
//	@RequestMapping("one.mega")
//	public void insert(BbsDTO bbsDTO) {
//		
//		System.out.println(bbsDTO);
//		dao.create(bbsDTO);
//		
//	}
	
	@RequestMapping("list2.mega")
	public void list(Model model) { // select할땐 model을 써준다
		
		List<BbsDTO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println("회원 전체 수 " + list.size());
	}
	
	@RequestMapping("two.mega")
	public void read(BbsDTO bbsDTO, Model model) {
		
		System.out.println(bbsDTO.getId());
		BbsDTO dto = dao.read(bbsDTO);
		model.addAttribute("dto", dto);
		
	}
}
