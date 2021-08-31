package com.mega.mvc9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired	
	MovieDAO dao;
	
	@RequestMapping("movie.do")
	public String movie(String moVie, int moNey) {
		
		System.out.println(moVie);
		System.out.println(moNey);
		if (moNey >= 10000) {
			return "pay";
		} else {
			return "redirect:movie.jsp";
		}
	}
	
	@RequestMapping("pay.do")
	public void moviePay() {
		dao.pay();
	}
}
